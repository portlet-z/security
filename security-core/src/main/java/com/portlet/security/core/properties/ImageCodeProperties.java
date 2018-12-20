package com.portlet.security.core.properties;

import lombok.Data;

/**
 * @author zhangxinzheng
 * @date 2018-12-19
 */
@Data
public class ImageCodeProperties extends SmsCodeProperties{
    private int width = 67;
    private int height = 23;
    public ImageCodeProperties() {
        setLength(4);
    }
}
