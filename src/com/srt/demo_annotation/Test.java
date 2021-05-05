package com.srt.demo_annotation;

import com.srt.demo_annotation.demo1.config.SpringConfig;
import com.srt.demo_annotation.demo1.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.Test
    public void testService1(){

        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean_annotation.xml");

        UserService userService=context.getBean("userService",UserService.class);
        System.out.println(userService);
        userService.add();
    }


    @org.junit.Test
    public void testService2(){

        ApplicationContext context=
                new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService=context.getBean("userService",UserService.class);
        System.out.println(userService);
        userService.add();
    }
}
