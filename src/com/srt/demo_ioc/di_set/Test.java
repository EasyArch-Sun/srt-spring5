package com.srt.demo_ioc.di_set;

import com.srt.demo1.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.Test
    public void testAdd() {

        //加载spring配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean-ioc-di.xml");

        //获取配置创建对象
        Book book = context.getBean("book", Book.class);

        System.out.println(book);
        book.testDemo();

    }
}