package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//@Component(value = "userService")
@Service
public class UserService {
    //根据类型进行注入 加上 Qualifier指定名称 两个注解一起使用
//    @Autowired
//    @Qualifier(value = "userDaoImpl2")

    //根据属性和名称注入
    @Resource(name = "userDaoImpl")
    UserDao userDao;

    public void add(){
        userDao.add();
        System.out.println("add..........");
    }

}
