package com.xiaobaicai.model;

import java.util.concurrent.Callable;

/**
 * @author caijy
 * @description 测试Callable方式
 * @date 2023/1/20 星期五 2:09 下午
 */
public class TestCallable implements Callable {

    @Override
    public Object call() throws Exception {
        System.out.println("TestCallable,currentThread=" + Thread.currentThread());
        return null;
    }
}
