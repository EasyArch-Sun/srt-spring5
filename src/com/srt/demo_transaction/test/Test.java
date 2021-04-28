package com.srt.demo_transaction.test;

import com.srt.demo_transaction.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.Test
    public void testAccount(){


        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean_transaction.xml");

        UserService account = context.getBean("userService", UserService.class);
        account.accountMoney();


    }
}
