package com.xiaobaicai.api;

import com.xiaobaicai.dto.DubboUserDTO;

/**
 * @author liguang
 * @date 2023/1/6 星期五 5:55 下午
 */
public interface UserService {

    DubboUserDTO getUser(String userId);
}
