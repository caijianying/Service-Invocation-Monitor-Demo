package com.xiaobaicai.app.service;

import com.xiaobaicai.domain.dto.UserDto;
import com.xiaobaicai.dto.DubboUserDTO;

/**
 * @author caijy
 * @description TODO
 * @date 2023/10/21 星期六 5:45 下午
 */
public interface IDemoAppService {

    UserDto getUser(String userId);

    DubboUserDTO getUserByDubbo(String uid);
}
