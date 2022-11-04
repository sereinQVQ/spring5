package com.qyj.spring5.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class UserProxy {

    @Pointcut("execution( * com.qyj.spring5.aop.*.*(..))")
    public void apiCut() {}

//    前置通知
    @Before(value = "apiCut()")
    public void before(){
        System.out.println("before..................");
    }

    @After(value = "apiCut()")
    public void after(){
        System.out.println("after..................");
    }

    @AfterReturning(value = "apiCut()")
    public void afterReturning(){
        System.out.println("afterReturning..................");
    }

    @AfterThrowing(value = "apiCut()")
    public void afterThrowing(){
        System.out.println("afterThrowing..................");
    }

    @Around(value = "apiCut()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("around  before...................");

        proceedingJoinPoint.proceed();

        System.out.println("around  after...................");
    }

}
