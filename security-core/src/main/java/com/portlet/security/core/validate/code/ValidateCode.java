package com.portlet.security.core.validate.code;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class ValidateCode implements Serializable {
    private static final long serialVersionUID = 3051339197466496056L;
    private String code;
    private LocalDateTime expireTime;

    public ValidateCode(String code, int expireIn) {
        this.code = code;
        this.expireTime = LocalDateTime.now().plusSeconds(expireIn);
    }

    public ValidateCode(String code, LocalDateTime expireIn) {
        this.code = code;
        this.expireTime = expireIn;
    }

    public boolean isExpired() {
        return LocalDateTime.now().isAfter(expireTime);
    }
}
