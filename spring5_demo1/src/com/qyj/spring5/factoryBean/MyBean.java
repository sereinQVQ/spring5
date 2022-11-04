package com.qyj.spring5.factoryBean;

import com.qyj.spring5.Orders;
import org.springframework.beans.factory.FactoryBean;

public class MyBean implements FactoryBean<Orders> {
    @Override
    public Orders getObject() throws Exception {
        Orders orders = new Orders();
        orders.setOname("123");
        return orders;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
