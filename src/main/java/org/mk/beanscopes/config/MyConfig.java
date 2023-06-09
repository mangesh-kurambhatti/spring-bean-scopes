package org.mk.beanscopes.config;

import org.mk.beanscopes.pojo.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfig {

    @Bean
//    @Scope(value = "prototype")
    public MyBean getMySingletonBean(){
        return new MyBean();
    }

    @Bean
    @Scope(value = "prototype")
    public MyBean getMyPrototypeBean(){
        return new MyBean();
    }

    @Bean
    @Scope(value = "request")
    public MyBean getMyRequestBean(){
        return new MyBean();
    }
}
