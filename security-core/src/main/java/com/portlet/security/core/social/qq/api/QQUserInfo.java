package com.portlet.security.core.social.qq.api;

import lombok.Data;

/**
 * @author zhangxinzheng
 * @date 2018-12-22
 */
@Data
public class QQUserInfo {

    /**
     * 返回码
     */
    private String ret;
    /**
     * 如果 ret < 0,会有相应的错误信息提示，返回数据全部用 UTF-8编码
     */
    private String msg;
    private String openId;
    private String is_lost;
    /**
     * 省
     */
    private String province;
    /**
     * 市
     */
    private String city;
    /**
     * 用户在 QQ 空间的昵称
     */
    private String nickname;
    /**
     * 大小为30*30像素的 QQ 空间 URL
     */
    private String figureurl;
    /**
     * 大小为50*50像素的 QQ 空间 URL
     */
    private String figureurl_1;
    /**
     * 大小为100*100像素的 QQ 空间 URL
     */
    private String figureurl_2;
    /**
     * 大小为40*40像素的 QQ 头像 URL
     */
    private String figureurl_qq_1;
    /**
     * 大小为100*100像素的 QQ 头像 URL.可能为空
     */
    private String figureurl_qq_2;
    /**
     * 性别。默认为"男"
     */
    private String gender;
    /**
     * 是否为黄钻用户(0 不是 1是)
     */
    private String is_yellow_vip;
    private String vip;
    /**
     * 黄钻等级
     */
    private String level;
    /**
     * 是否为年费黄钻用户
     */
    private String is_yellow_year_vip;
}
