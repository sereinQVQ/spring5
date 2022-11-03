package com.atguigu.spring5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {
    public static void main(String[] args) {
        Class[] interfaces = {UserDao.class};
//        Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                return null;
//            }
//        });

        UserDaoImpl userDao = new UserDaoImpl();
        UserDao dao = (UserDao)Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        System.out.println(dao.add(1,2));
    }
}


class UserDaoProxy implements InvocationHandler{

    private Object obj;
    public UserDaoProxy(Object obj){
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long start = System.currentTimeMillis();

        //方法之前执行
        System.out.println("方法执行之前。。。。"+method.getName()+"  传递的参数。。。"+ Arrays.toString(args));

        //执行方法
        Object invoke = method.invoke(obj, args);

        long end = System.currentTimeMillis();
        //方法执行之后
        System.out.println("方法执行完成之后执行。。。。。。。。");
        System.out.println("方法执行用时："+(end-start));

        return invoke;
    }
}
