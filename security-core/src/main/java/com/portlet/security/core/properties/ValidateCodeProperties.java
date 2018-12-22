package com.portlet.security.core.properties;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhangxinzheng
 * @date 2018-12-19
 */
@Data
public class ValidateCodeProperties {
    @Getter
    @Setter
    private ImageCodeProperties image = new ImageCodeProperties();
    @Getter
    @Setter
    private SmsCodeProperties sms = new SmsCodeProperties();

}
