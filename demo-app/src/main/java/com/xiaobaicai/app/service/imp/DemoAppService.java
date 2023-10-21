package com.xiaobaicai.app.service.imp;

import com.xiaobaicai.api.UserService;
import com.xiaobaicai.app.service.IDemoAppService;
import com.xiaobaicai.domain.dto.UserDto;
import com.xiaobaicai.domain.service.DemoDomainService;
import com.xiaobaicai.dto.DubboUserDTO;
import com.xiaobaicai.infrastructrue.util.TimeUtil;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author caijy
 * @date 2022/7/16 星期六 9:54 下午
 */
@Service
public class DemoAppService implements IDemoAppService {
    @Autowired
    private DemoDomainService demoDomainService;

    @DubboReference
    private UserService userService;

    @Override
    public UserDto getUser(String userId) {
        UserDto userDto = demoDomainService.getByUserId(userId);
        //模拟数据处理耗时
        TimeUtil.mockTimeCost(50);
        return userDto;
    }

    @Override
    public DubboUserDTO getUserByDubbo(String uid) {
        return userService.getUser(uid);
    }
}
