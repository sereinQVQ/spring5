package com.atguigu.spring5.config;

import com.atguigu.spring5.bean.Person;
import com.atguigu.spring5.bean.User;
import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan(value = "com.atguigu")
@ComponentScan(value = "com.atguigu",includeFilters =  {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {org.springframework.stereotype.Service.class}),
        @ComponentScan.Filter(type = FilterType.CUSTOM , value = {MyTypeFilter.class}),

},excludeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION , value = {Repository.class})
}
,useDefaultFilters = false)
public class MyConfig2 {

//    @Scope(scopeName = "prototype")
    @Scope(scopeName = "singleton")
    @Bean
    public Person person(){
        return  new Person("tom",18);
    }


}
