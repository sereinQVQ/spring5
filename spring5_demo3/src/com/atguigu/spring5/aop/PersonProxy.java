package com.atguigu.spring5.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class PersonProxy {

    @Before(value = "com.atguigu.spring5.aop.UserProxy.apiCut()")
    public void before(){
        System.out.println("person before....................");
    }

}
