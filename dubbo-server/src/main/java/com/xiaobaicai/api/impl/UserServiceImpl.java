package com.xiaobaicai.api.impl;

import com.xiaobaicai.api.UserService;
import com.xiaobaicai.dto.DubboUserDTO;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author liguang
 * @date 2023/1/6 星期五 6:01 下午
 */
@DubboService
public class UserServiceImpl implements UserService {
    @Override
    public DubboUserDTO getUser(String userId) {
        DubboUserDTO userDTO = new DubboUserDTO();
        userDTO.setUserId(userId);
        userDTO.setUsername("xiaobaicai");
        return userDTO;
    }
}
