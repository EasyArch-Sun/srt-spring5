package com.srt.demo_life;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.Test
    public void test(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean_life.xml");


        Orders orders=context.getBean("orders",Orders.class);
        System.out.println("4.使用bean");
        System.out.println(orders);

        //手动销毁方法
        ((ClassPathXmlApplicationContext)context).close();
    }

}
