package com.qyj.spring5.service;

import com.qyj.spring5.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
//    @Transactional(propagation = Propagation.REQUIRES_NEW,isolation = Isolation.DEFAULT,readOnly = false,rollbackFor = Exception.class)
    @Transactional(rollbackFor = RuntimeException.class)
    public void pay() throws RuntimeException{
        userMapper.updateAdd(1);

        if(0 == 0){
          throw new RuntimeException("回滚");
        }
        userMapper.updateLess(2);
    }
}
