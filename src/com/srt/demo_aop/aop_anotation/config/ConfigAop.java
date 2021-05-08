package com.srt.demo_aop.aop_anotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//==bean_aop_annotation
@Configuration
@ComponentScan(basePackages = {"com.srt.demo_aop.aop_anotation"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigAop {
}
