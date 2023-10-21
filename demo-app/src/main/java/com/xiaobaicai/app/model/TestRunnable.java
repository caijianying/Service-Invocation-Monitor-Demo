package com.xiaobaicai.app.model;

/**
 * @author caijy
 * @description TODO
 * @date 2023/1/20 星期五 2:10 下午
 */
public class TestRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("TestRunnable,currentThread=" + Thread.currentThread());
    }
}
