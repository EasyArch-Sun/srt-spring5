package com.srt.demo_ioc.di_con;

import com.srt.demo_ioc.di_set.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.Test
    public void testAdd() {

        //加载spring配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean-ioc-di.xml");

        //获取配置创建对象
        Orders order = context.getBean("order", Orders.class);

        System.out.println(order);
        order.ordersTest();

    }
}