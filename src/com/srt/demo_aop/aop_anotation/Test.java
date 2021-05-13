package com.srt.demo_aop.aop_anotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.Test
    public void testAop(){

        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean_aop_annotation.xml");

        User user = context.getBean("user", User.class);
        user.add();

    }
}
