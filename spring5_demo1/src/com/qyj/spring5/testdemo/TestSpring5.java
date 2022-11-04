package com.qyj.spring5.testdemo;

import com.qyj.spring5.Book;
import com.qyj.spring5.Orders;
import com.qyj.spring5.User;
import com.qyj.spring5.autowire.Emp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {

    @Test
    public void testAdd(){
        //1.加载spring配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        //2.获取配置创建的对象
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }

    @Test
    public void testBook(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
    }

    @Test
    public void testOrders(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println(orders);
    }

    @Test
    public void testMyBean(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Orders myBean = context.getBean("myBean", Orders.class);
        Orders myBean2 = context.getBean("myBean", Orders.class);
        System.out.println(myBean);
        System.out.println(myBean2);
    }

    @Test
    public void testBean5(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("第四步 获取获取创建bean实例对象");
        System.out.println(orders);
        context.close();
    }

    @Test
    public void testBean6(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean6.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }

}
