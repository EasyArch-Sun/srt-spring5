package com.srt.demo_ioc.di_other.collection_bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.Test
    public void test(){

        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean-ioc-di.xml");

        Stu stu=context.getBean("stu",Stu.class);

        stu.test();
    }


    @org.junit.Test
    public void test1(){

        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean-di-util.xml");

        Book book=context.getBean("book",Book.class);

        book.test();
    }
}
