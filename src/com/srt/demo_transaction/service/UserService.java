package com.srt.demo_transaction.service;

import com.srt.demo_transaction.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserDao userDao;

    public void accountMoney(){

        //编程式try-catch
//        try {
            //1.开启事务
            //2.业务操作
//        userDao.reduceMoney();
//        userDao.addMoney();
            //3.无异常，正常进行
//        }catch (Exception e){
         //4.出现异常，回滚
//        }


        userDao.reduceMoney();

        int i=10/0;

        userDao.addMoney();
    }




}
