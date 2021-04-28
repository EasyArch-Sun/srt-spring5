package com.srt.demo_ioc.factoryBean;

import com.srt.demo_ioc.di_other.Book;
import com.srt.demo_ioc.di_other.collection_bean.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.Test
    public void testAdd() {

        //加载spring配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean-factory.xml");

        //获取配置创建对象
//        MyBean myBean = context.getBean("myBean", MyBean.class);
        Course course=context.getBean("myBean",Course.class);
        System.out.println(course);

    }
}