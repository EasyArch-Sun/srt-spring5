package com.srt.demo_transaction.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;


    //lucy转100给Mary

    @Override
    public void addMoney() {

        String sql="update account set money=money+? where username=?";

        jdbcTemplate.update(sql,100,"mary");


    }

    @Override
    public void reduceMoney() {

        String sql="update account set money=money-? where username=?";

        jdbcTemplate.update(sql,100,"lucy");




    }
}
