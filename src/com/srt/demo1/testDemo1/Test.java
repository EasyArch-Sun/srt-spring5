package com.srt.demo1.testDemo1;

import com.srt.demo1.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.Test
    public void testAdd(){

        //加载spring配置文件
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean1.xml");

        //获取配置创建对象
        User user=context.getBean("user", User.class);

        System.out.println(user);
        user.add();

    }
}
