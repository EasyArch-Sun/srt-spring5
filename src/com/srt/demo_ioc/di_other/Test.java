package com.srt.demo_ioc.di_other;

import com.srt.demo_ioc.di_other.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.Test
    public void testAdd() {

        //加载spring配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean-ioc-di.xml");

        //获取配置创建对象
        Book book1 = context.getBean("book1", Book.class);

        System.out.println(book1);
        book1.testDemo();

    }
}