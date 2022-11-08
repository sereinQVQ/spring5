package com.atguigu.spring5;

import com.atguigu.spring5.bean.Person;
import com.atguigu.spring5.config.MyConfig;
import com.atguigu.spring5.config.MyConfig2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDemo {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }


    @Test
    public void test02(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig2.class);
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

        Person person = context.getBean("person", Person.class);
        Person person2 = context.getBean("person", Person.class);
        System.out.println(person == person2);
    }

}
