package com.xiaobaicai.interfaces.api;

import java.util.concurrent.FutureTask;

import com.alibaba.fastjson.JSON;

import com.xiaobaicai.app.service.imp.DemoAppService;
import com.xiaobaicai.domain.dto.UserDto;
import com.xiaobaicai.dto.DubboUserDTO;
import com.xiaobaicai.app.model.TestCallable;
import com.xiaobaicai.app.model.TestRunnable;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author caijy
 * @date 2022/7/16 星期六 9:52 下午
 */
@Slf4j
@RestController
@RequestMapping("api/demo")
public class DemoController {

    @Autowired
    private DemoAppService demoAppService;

    @GetMapping("/getUserInfo")
    public String getUserInfo(String userId) {
        UserDto user = demoAppService.getUser(userId);
        this.testMultiThread();
        return user.toString();
    }

    @GetMapping("/getUserInfoRpc")
    public String getUserInfoRpc(String userId) {
        DubboUserDTO user = demoAppService.getUserByDubbo(userId);
        return JSON.toJSONString(user);
    }

    @GetMapping("/multiThread")
    public String testMultiThread() {
        // runnable方式
        new Thread(new TestRunnable()).start();

        // Callable 方式
        TestCallable callable = new TestCallable();
        FutureTask futureTask = new FutureTask(callable);
        futureTask.run();

        log.info("testMultiThread finished.");
        return "";
    }
}
