package com.portlet.web.controller;

import com.portlet.dto.User;
import com.portlet.dto.UserQueryCondition;
import com.portlet.security.app.social.impl.AppSignUpUtils;
import com.portlet.security.core.properties.SecurityProperties;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.core.Authentication;
import org.springframework.social.connect.web.ProviderSignInUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.ServletWebRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private ProviderSignInUtils providerSignInUtils;

    @Autowired
    private AppSignUpUtils appSignUpUtils;

    @Autowired
    private SecurityProperties securityProperties;

    @GetMapping
    public List<User> user(UserQueryCondition condition,@PageableDefault Pageable pageable) {
        System.out.println(ReflectionToStringBuilder.toString(condition, ToStringStyle.MULTI_LINE_STYLE));
        System.out.println(ReflectionToStringBuilder.toString(pageable, ToStringStyle.MULTI_LINE_STYLE));

        List<User> users = new ArrayList<>();
        users.add(new User());
        users.add(new User());
        users.add(new User());
        return users;
    }

    @GetMapping("/{id:\\d+}")
    public User user(@PathVariable String id) {
        User user = new User();
        user.setUsername("tom");
        return user;
    }

    @PostMapping("/register")
    public void register(User user, HttpServletRequest request) {
        //注册用户
        //不管是注册用户还是绑定用户，都会拿到一个用户唯一标识
        String userId = user.getUsername();
        //providerSignInUtils.doPostSignUp(userId, new ServletWebRequest(request));
        appSignUpUtils.doPostSignUp(new ServletWebRequest(request), userId);
    }

    @GetMapping("/me")
    public Object getCurrentUser(Authentication user, HttpServletRequest request) throws UnsupportedEncodingException {
        String header = request.getHeader("Authorization");
        String token = StringUtils.substringAfter(header, "bear ");
        Claims claims = Jwts.parser().setSigningKey(securityProperties.getOauth2().getJwtSigningKey().getBytes("UTF-8"))
            .parseClaimsJws(token).getBody();
        String company = (String) claims.get("company");
        log.info("company:{}", company);
        return user;
    }
}
