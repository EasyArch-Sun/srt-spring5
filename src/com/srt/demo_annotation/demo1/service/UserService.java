package com.srt.demo_annotation.demo1.service;

import com.srt.demo_annotation.demo1.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//@Component(value = "userService") //<bean id="userService">
@Service
public class UserService {
//
//    @Autowired
//    @Qualifier(value = "userDaoImpl1")
//    @Resource
    @Resource(name = "userDaoImpl1")
    private UserDao userDao;

    @Value(value = "abc")
    private String name;

    public void add(){
        System.out.println("add()..."+name);
        userDao.add();
    }
}
