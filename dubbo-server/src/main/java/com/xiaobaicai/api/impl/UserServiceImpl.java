package com.xiaobaicai.api.impl;

import com.xiaobaicai.api.UserService;
import com.xiaobaicai.dto.DubboUserDTO;
import com.xiaobaicai.model.TestRunnable;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.concurrent.TimeUnit;

/**
 * @author liguang
 * @date 2023/1/6 星期五 6:01 下午
 */
@DubboService
public class UserServiceImpl implements UserService {
    @Override
    public DubboUserDTO getUser(String userId) {
        new Thread(new TestRunnable()).start();
        try {
            TimeUnit.MILLISECONDS.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        DubboUserDTO userDTO = new DubboUserDTO();
        userDTO.setUserId(userId);
        userDTO.setUsername("xiaobaicai");
        return userDTO;
    }
}
