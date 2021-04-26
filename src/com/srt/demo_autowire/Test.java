package com.srt.demo_autowire;

import com.srt.demo_life.Orders;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.Test
    public void test() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean_autowire.xml");


        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);

    }


}
