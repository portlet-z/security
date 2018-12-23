package com.portlet.security.core.social;

import org.springframework.social.security.SocialAuthenticationFilter;

/**
 * @author zhangxinzheng
 *
 */
public interface SocialAuthenticationFilterPostProcessor {
	
	void process(SocialAuthenticationFilter socialAuthenticationFilter);

}
