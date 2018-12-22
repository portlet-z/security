package com.portlet.security.core.properties;

import lombok.Data;

@Data
public class BrowserProperties {
    private String signUpUrl = "signUp.html";
    private String loginPage = SecurityConstants.DEFAULT_LOGIN_PAGE_URL;
    private LoginType loginType = LoginType.JSON;
    private int rememberMeSeconds = 3600;
}
