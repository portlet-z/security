package com.portlet.dto;

import lombok.Data;

@Data
public class UserQueryCondition {
    private String username;
    private int age;
    private int ageTo;
}
