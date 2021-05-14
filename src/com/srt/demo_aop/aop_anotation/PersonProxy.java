package com.srt.demo_aop.aop_anotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class PersonProxy {

    //前置通知
    @Before(value = "execution(* com.srt.demo_aop.aop_anotation.User.add(..))")
    public void before(){
        System.out.println("Person before..");
    }
}
