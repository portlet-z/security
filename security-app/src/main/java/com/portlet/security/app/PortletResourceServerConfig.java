package com.portlet.security.app;

import com.portlet.security.core.authentication.mobile.SmsCodeAuthenticationSecurityConfig;
import com.portlet.security.core.properties.SecurityConstants;
import com.portlet.security.core.properties.SecurityProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.social.security.SpringSocialConfigurer;

/**
 * @author zhangxinzheng
 * @date 2018-12-23
 */
@Configuration
@EnableResourceServer
public class PortletResourceServerConfig extends ResourceServerConfigurerAdapter {
    @Autowired
    private AuthenticationSuccessHandler authenticationSuccessHandler;

    @Autowired
    private AuthenticationFailureHandler authenticationFailureHandler;

    @Autowired
    private SmsCodeAuthenticationSecurityConfig smsCodeAuthenticationSecurityConfig;

    @Autowired
    private SecurityProperties securityProperties;

    @Autowired
    private SpringSocialConfigurer portletSocialConfigurer;

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.formLogin()
                .loginPage(SecurityConstants.DEFAULT_UNAUTHENTICATION_URL)
                .loginProcessingUrl(SecurityConstants.DEFAULT_LOGIN_PROCESSING_URL_FORM)
                .successHandler(authenticationSuccessHandler)
                .failureHandler(authenticationFailureHandler);

        http//.apply(validateCodeSecurityConfig)
                //.and()
                .apply(smsCodeAuthenticationSecurityConfig)
                .and()
                .apply(portletSocialConfigurer)
                .and()
                .authorizeRequests()
                .antMatchers(
                        SecurityConstants.DEFAULT_UNAUTHENTICATION_URL,
                        SecurityConstants.DEFAULT_LOGIN_PROCESSING_URL_MOBILE,
                        securityProperties.getBrowser().getLoginPage(),
                        SecurityConstants.DEFAULT_VALIDATE_CODE_URL_PREFIX + "/*",
                        securityProperties.getBrowser().getSignUpUrl(),
                        securityProperties.getBrowser().getSignOutUrl(),
                        "/user/register",
                        securityProperties.getBrowser().getSession().getSessionInvalidUrl()
                ).permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .csrf().disable();
    }
}
