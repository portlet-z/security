package com.portlet.security.core.properties;

/**
 * @author zhangxinzheng
 * @date 2018-12-22
 */
public interface SecurityConstants {

    /**
     * 默认的处理验证码的 url 前缀
     */
    String DEFAULT_VALIDATE_CODE_URL_PREFIX = "/code";

    /**
     * 当请求需要身份认证时，默认跳转的 url
     */
    String DEFAULT_UNAUTHENTICATION_URL = "/authentication/require";

    /**
     * 默认的用户名密码登录请求处理 url
     */
    String DEFAULT_LOGIN_PROCESSING_URL_FORM = "/authentication/form";

    /**
     * 默认的手机验证码登录请求处理 url
     */
    String DEFAULT_LOGIN_PROCESSING_URL_MOBILE = "/authentication/mobile";

    /**
     * 默认的OPENID登录请求处理url
     */
    public static final String DEFAULT_LOGIN_PROCESSING_URL_OPENID = "/authentication/openid";

    /**
     * 默认登录页面
     */
    String DEFAULT_LOGIN_PAGE_URL = "/signIn.html";

    /**
     * 验证图片验证码时，http 请求中默认的携带图片验证码信息的参数的名称
     */
    String DEFAULT_PARAMETER_NAME_CODE_IMAGE = "imageCode";

    /**
     * 验证短信验证码或发送短信验证码时，传递手机号的参数的名称
     */
    String DEFAULT_PARAMETER_NAME_CODE_SMS = "mobile";

    /**
     * openid参数名
     */
    public static final String DEFAULT_PARAMETER_NAME_OPENID = "openId";
    /**
     * providerId参数名
     */
    public static final String DEFAULT_PARAMETER_NAME_PROVIDERID = "providerId";

    /**
     * session 失效默认的跳转地址
     */
    String DEFAULT_SESSION_INVALID_URL = "/session/invalid";
}
