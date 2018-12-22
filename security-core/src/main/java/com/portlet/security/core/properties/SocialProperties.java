package com.portlet.security.core.properties;

import lombok.Data;

/**
 * @author zhangxinzheng
 * @date 2018-12-22
 */

@Data
public class SocialProperties {
    private String filterProcessesUrl = "/auth";
    private QQProperties qq = new QQProperties();
    private WeixinProperties weixin = new WeixinProperties();
}
