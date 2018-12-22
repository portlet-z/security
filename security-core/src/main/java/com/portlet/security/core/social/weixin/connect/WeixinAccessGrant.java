package com.portlet.security.core.social.weixin.connect;

import lombok.Data;
import org.springframework.social.oauth2.AccessGrant;

/**
 * @author zhangxinzheng
 * @date 2018-12-22
 */
@Data
public class WeixinAccessGrant extends AccessGrant {

    private static final long serialVersionUID = -7243374526633186782L;

    private String openId;

    public WeixinAccessGrant() {
        super("");
    }

    public WeixinAccessGrant(String accessToken, String scope, String refreshToken, Long expiresIn) {
        super(accessToken, scope, refreshToken, expiresIn);
    }

}
