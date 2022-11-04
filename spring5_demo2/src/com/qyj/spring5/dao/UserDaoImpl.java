package com.qyj.spring5.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{

    @Value(value = "value")
    private String value;

    @Override
    public void add() {
        System.out.println("dao add ..................."+value);
    }
}
