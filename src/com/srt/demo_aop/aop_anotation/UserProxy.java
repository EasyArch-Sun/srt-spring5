package com.srt.demo_aop.aop_anotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//增强的类
@Component
@Aspect
@Order(3)
public class UserProxy {

    //2.0版本：相同切入点抽取
    @Pointcut(value = "execution(* com.srt.demo_aop.aop_anotation.User.add(..))")
    public void pointDemo(){

    }

    //前置通知
//    @Before(value = "execution(* com.srt.demo_aop.aop_anotation.User.add(..))")
    @Before(value = "pointDemo()")
    public void before(){
        System.out.println("before..");
    }

    //最终通知
    @After(value = "execution(* com.srt.demo_aop.aop_anotation.User.add(..))")
    public void after(){
        System.out.println("after..");
    }

    //后置通知
    @AfterReturning(value = "execution(* com.srt.demo_aop.aop_anotation.User.add(..))")
    public void afterReturning(){
        System.out.println("afterReturning..");
    }


    //异常通知
    @AfterThrowing(value = "execution(* com.srt.demo_aop.aop_anotation.User.add(..))")
    public void afterThrowing(){
        System.out.println("afterThrowing..");
    }


    //环绕通知
    @Around(value = "execution(* com.srt.demo_aop.aop_anotation.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        System.out.println("around 之前..");

        // 被增强的方法执行
        proceedingJoinPoint.proceed();

        System.out.println("around 之后..");

    }

}
