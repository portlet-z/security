package com.portlet.security.core.validate.code;

import org.springframework.web.context.request.ServletWebRequest;

/**
 * @author zhangxinzheng
 * @date 2018-12-19
 */
public interface ValidateCodeGenerator {
    ImageCode generate(ServletWebRequest request);
}
