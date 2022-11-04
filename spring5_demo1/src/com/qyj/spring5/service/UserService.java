package com.qyj.spring5.service;

import com.qyj.spring5.dao.UserDao;

public class UserService {

    private UserDao userDao;

    public void add(){
        System.out.println("service add ...............");
    }
}
