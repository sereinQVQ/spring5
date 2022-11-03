package com.atguigu.spring5.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl2 implements UserDao{
    @Override
    public void add() {
        System.out.println("add dao2 ......................");
    }
}
