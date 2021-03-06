package com.portlet.security.app.social.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.social.security.SocialAuthenticationFilter;
import org.springframework.stereotype.Component;

import com.portlet.security.core.social.SocialAuthenticationFilterPostProcessor;

/**
 * @author zhangxinzheng
 *
 */
@Component
public class AppSocialAuthenticationFilterPostProcessor implements SocialAuthenticationFilterPostProcessor {
	
	@Autowired
	private AuthenticationSuccessHandler authenticationSuccessHandler;

	@Override
	public void process(SocialAuthenticationFilter socialAuthenticationFilter) {
		socialAuthenticationFilter.setAuthenticationSuccessHandler(authenticationSuccessHandler);
	}

}