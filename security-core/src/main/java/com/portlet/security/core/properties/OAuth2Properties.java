package com.portlet.security.core.properties;

import lombok.Data;

/**
 * @author zhangxinzheng
 * @date 2018-12-24
 */
@Data
public class OAuth2Properties {
    private OAuth2ClientProperties[] clients = {};
}
