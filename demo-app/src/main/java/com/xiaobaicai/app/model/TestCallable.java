package com.xiaobaicai.app.model;

import java.util.concurrent.Callable;

/**
 * @author caijy
 * @description TODO
 * @date 2023/1/20 星期五 2:09 下午
 */
public class TestCallable implements Callable {

    @Override
    public Object call() throws Exception {
        System.out.println("TestCallable,currentThread=" + Thread.currentThread());
        return null;
    }
}
