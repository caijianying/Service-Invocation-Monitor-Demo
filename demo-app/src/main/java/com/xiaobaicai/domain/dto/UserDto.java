package com.xiaobaicai.domain.dto;

import lombok.Data;
import lombok.ToString;


/**
 * @author caijy
 * @date 2022/7/16 星期六 10:02 下午
 */
@Data
@ToString
public class UserDto {
    /**
     * 昵称
     **/
    private String nickName;
    /**
     * 用户密码
     **/
    private String password;

}
