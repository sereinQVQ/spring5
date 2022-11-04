package com.qyj.spring5.testDemo;

import com.qyj.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {



    @Test
    public void testPay() throws RuntimeException{
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userServiceImpl", UserService.class);
        userService.pay();
    }

}
