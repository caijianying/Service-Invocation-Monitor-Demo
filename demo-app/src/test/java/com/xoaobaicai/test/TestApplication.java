package com.xoaobaicai.test;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"com.xiaobaicai"})
public class TestApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(TestApplication.class).web(WebApplicationType.NONE).run(args);
    }
}
