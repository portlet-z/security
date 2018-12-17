package com.portlet.security.core.properties;

import lombok.Data;

@Data
public class BrowserProperties {
    private String loginPage = "/signIn.html";
    private LoginType loginType = LoginType.JSON;
}
