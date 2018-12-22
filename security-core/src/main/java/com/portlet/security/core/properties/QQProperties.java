package com.portlet.security.core.properties;

import lombok.Data;
import org.springframework.boot.autoconfigure.social.SocialProperties;

/**
 * @author zhangxinzheng
 * @date 2018-12-22
 */
@Data
public class QQProperties extends SocialProperties {

    private String providerId = "qq";
}
