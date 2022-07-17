package com.xiaobaicai.interfaces.controller;

import com.xiaobaicai.app.service.DemoAppService;
import com.xiaobaicai.domain.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author caijy
 * @date 2022/7/16 星期六 9:52 下午
 */
@RestController
@RequestMapping("demo")
public class DemoController {

    @Autowired
    private DemoAppService demoAppService;

    @GetMapping("getUserInfo")
    public String getUserInfo(String userId){
        UserDto user = demoAppService.getUser(userId);
        return user.toString();
    }
}
