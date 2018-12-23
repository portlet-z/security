package com.portlet.security.core.properties;

import lombok.Data;

/**
 * @author zhangxinzheng
 * @date 2018-12-23
 */
@Data
public class SessionProperties {
    private int maximumSessions = 1;
    private boolean maxSessionsPreventsLogin;
    private String sessionInvalidUrl = SecurityConstants.DEFAULT_SESSION_INVALID_URL;
}
