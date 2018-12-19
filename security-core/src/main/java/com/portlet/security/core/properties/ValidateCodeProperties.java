package com.portlet.security.core.properties;

import lombok.Data;

/**
 * @author zhangxinzheng
 * @date 2018-12-19
 */
@Data
public class ValidateCodeProperties {
    private ImageCodeProperties image = new ImageCodeProperties();
}
