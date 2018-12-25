package com.portlet.security.core.authorize;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * @author zhangxinzheng
 * @date 2018-12-25
 */
@Component
public class PortletAuthorizeConfigManager implements AuthorizeConfigManager {

    @Autowired
    private Set<AuthorizeConfigProvider> authorizeConfigProviders;

    @Override
    public void config(ExpressionUrlAuthorizationConfigurer<HttpSecurity>.ExpressionInterceptUrlRegistry config) {
        for (AuthorizeConfigProvider provider : authorizeConfigProviders) {
            provider.config(config);
        }
        config.anyRequest().authenticated();
    }
}
