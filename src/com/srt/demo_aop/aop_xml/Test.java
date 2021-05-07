package com.srt.demo_aop.aop_xml;

import com.srt.demo_aop.aop_anotation.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.Test
    public void testAop(){

        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean_aop_xml.xml");

        Book book = context.getBean("book", Book.class);
        book.buy();

    }
}
