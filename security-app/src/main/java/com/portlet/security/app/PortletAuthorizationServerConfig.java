package com.portlet.security.app;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

/**
 * @author zhangxinzheng
 * @date 2018-12-23
 */
@Configuration
@EnableAuthorizationServer
public class PortletAuthorizationServerConfig extends ResourceServerConfigurerAdapter {


}
