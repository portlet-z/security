package com.portlet.security.core.validate.code.sms;

/**
 * @author zhangxinzheng
 * @date 2018-12-20
 */
public interface SmsCodeSender {
    void send(String mobile, String code);
}
