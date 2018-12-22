package com.portlet.security.core.social.weixin.api;

/**
 * @author zhangxinzheng
 * @date 2018-12-22
 */
public interface Weixin {
    WeixinUserInfo getUserInfo(String openId);
}
