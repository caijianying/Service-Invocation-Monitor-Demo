package com.xiaobaicai.infrastructrue.bean;

import lombok.Data;

/**
 * @author caijy
 * @desciption: 模拟数据库实体对象
 * @date 2022/7/16 星期六 10:09 下午
 */
@Data
public class UserBean {

    /**
     * 昵称
     **/
    private String nickName;
    /**
     * 用户密码
     **/
    private String password;
}
