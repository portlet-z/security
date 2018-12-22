package com.portlet.security.core.properties;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "portlet.security")
public class SecurityProperties {
    @Getter
    @Setter
    private BrowserProperties browser = new BrowserProperties();
    @Getter
    @Setter
    private ValidateCodeProperties code = new ValidateCodeProperties();
}
