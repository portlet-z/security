package com.portlet.security.core.validate.code;

import org.springframework.security.core.AuthenticationException;

/**
 * @author zhangxinzheng
 * @date 2018-12-17
 */
public class ValidateCodeException extends AuthenticationException {
    public ValidateCodeException(String msg, Throwable t) {
        super(msg, t);
    }

    public ValidateCodeException(String msg) {
        super(msg);
    }
}
