package com.portlet.security.core.properties;

import lombok.Data;

/**
 * @author zhangxinzheng
 * @date 2018-12-24
 */
@Data
public class OAuth2ClientProperties {
    private String clientId;
    private String clientSecret;
    private int accessTokenValiditySeconds;
}
