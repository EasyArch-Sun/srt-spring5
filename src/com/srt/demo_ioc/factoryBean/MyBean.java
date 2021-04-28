package com.srt.demo_ioc.factoryBean;

import com.srt.demo_ioc.di_other.collection_bean.Course;
import org.springframework.beans.factory.FactoryBean;

public class MyBean implements FactoryBean<Course> {

    @Override
    public Course getObject() throws Exception {
        Course course=new Course();
        course.setCname("xxx");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
