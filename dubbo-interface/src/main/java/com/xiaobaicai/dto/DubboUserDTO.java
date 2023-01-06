package com.xiaobaicai.dto;

import java.io.Serializable;

/**
 * @author liguang
 * @date 2023/1/6 星期五 5:57 下午
 */
public class DubboUserDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String username;

    private String userId;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
