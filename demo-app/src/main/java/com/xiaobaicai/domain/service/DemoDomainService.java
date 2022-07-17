package com.xiaobaicai.domain.service;

import com.xiaobaicai.domain.dto.UserDto;
import com.xiaobaicai.infrastructrue.bean.UserBean;
import com.xiaobaicai.infrastructrue.dao.DemoDaoService;
import com.xiaobaicai.infrastructrue.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author caijy
 * @date 2022/7/16 星期六 9:55 下午
 */
@Service
public class DemoDomainService {

    @Autowired
    DemoDaoService demoDaoService;

    public UserDto getByUserId(String userId){
        // 模拟数据校验耗时
        TimeUtil.mockTimeCost(100);
        // 返回
        UserBean userBean = demoDaoService.selectById(userId);
        UserDto userDto = new UserDto();
        userDto.setPassword(userBean.getPassword());
        userDto.setNickName(userBean.getNickName());
        return userDto;
    }
}
