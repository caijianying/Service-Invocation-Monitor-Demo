package com.xiaobaicai.infrastructrue.util;

import java.util.concurrent.TimeUnit;

/**
 * @author caijy
 * @date 2022/7/16 星期六 10:15 下午
 */
public class TimeUtil {

    public static void mockTimeCost(long milliseconds){
        try {
            TimeUnit.MILLISECONDS.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
