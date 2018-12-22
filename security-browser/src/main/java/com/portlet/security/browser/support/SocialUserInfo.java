package com.portlet.security.browser.support;

import lombok.Data;

/**
 * @author zhangxinzheng
 * @date 2018-12-22
 */
@Data
public class SocialUserInfo {
    private String providerId;
    private String providerUserId;
    private String nickname;
    private String headimg;
}
