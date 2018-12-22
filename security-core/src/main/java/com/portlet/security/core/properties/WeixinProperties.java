package com.portlet.security.core.properties;

import lombok.Data;
import org.springframework.boot.autoconfigure.social.SocialProperties;

/**
 * @author zhangxinzheng
 * @date 2018-12-22
 */
@Data
public class WeixinProperties extends SocialProperties {

    private String providerId = "weixin";
}
