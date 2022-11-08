package com.atguigu.spring5.config;

import com.atguigu.spring5.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Repository;

@Configuration
//@ComponentScan(value = "com.atguigu")
@ComponentScan(value = "com.atguigu",includeFilters =  {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {org.springframework.stereotype.Service.class}),
        @ComponentScan.Filter(type = FilterType.CUSTOM , value = {MyTypeFilter.class}),

},excludeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION , value = {Repository.class})
}
,useDefaultFilters = false)
public class MyConfig {


    @Bean
    public User user(){
        return  new User("tom",18);
    }


}
