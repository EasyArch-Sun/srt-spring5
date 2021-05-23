package com.srt.demo_ioc.di_other.external_bean.service;

import com.srt.demo_ioc.di_other.external_bean.dao.UserDao;

public class UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("UserService...");

        userDao.update();
    }


}
