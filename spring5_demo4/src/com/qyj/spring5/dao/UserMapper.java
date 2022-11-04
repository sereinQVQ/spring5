package com.qyj.spring5.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    void updateAdd(Integer id);
    void updateLess(Integer id);
}
