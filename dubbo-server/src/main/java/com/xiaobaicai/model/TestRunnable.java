package com.xiaobaicai.model;

/**
 * @author caijy
 * @description 测试Runnable方式
 * @date 2023/1/20 星期五 2:10 下午
 */
public class TestRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("TestRunnable,currentThread=" + Thread.currentThread());
    }
}
