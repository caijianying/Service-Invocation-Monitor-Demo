package com.xiaobaicai.interfaces.controller;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.alibaba.fastjson.JSON;

import com.xiaobaicai.app.service.DemoAppService;
import com.xiaobaicai.domain.dto.UserDto;
import com.xiaobaicai.dto.DubboUserDTO;
import com.xiaobaicai.interfaces.controller.thread.TestCallable;
import com.xiaobaicai.interfaces.controller.thread.TestRunnable;
import lombok.AllArgsConstructor;
import lombok.Data;
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
@RequestMapping("/demo")
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
        TestCallable callable = new TestCallable("{}");
        FutureTask futureTask = new FutureTask(callable);
        futureTask.run();

        log.info("testMultiThread finished.");
        return "";
    }
}
