package com.xoaobaicai.test;


import com.xiaobaicai.app.service.DemoAppService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {TestApplication.class})
public class DemoAppTest {

    @Autowired
    private DemoAppService demoAppService;

    @Test
    public void test01(){
        demoAppService.getUser("1");
    }

}
