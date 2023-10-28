package com.xiaobaicai.tkmybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author caijy
 * @description
 * @date 2023/10/28 星期六 3:26 下午
 */
@MapperScan("com.xiaobaicai.tkmybatis.mapper")
@SpringBootApplication
public class TkMybatisApp {

    public static void main(String[] args) {
        SpringApplication.run(TkMybatisApp.class, args);
    }
}
