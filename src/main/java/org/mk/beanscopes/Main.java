package org.mk.beanscopes;

import org.mk.beanscopes.config.MyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Main {

    @Autowired
    public MyConfig myConfig;

    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }

//    @PostConstruct
//    public void init(){
//        System.out.println("================== Singleton Bean==================");
//        System.out.println(myConfig.getMySingletonBean().hashCode());
//        System.out.println(myConfig.getMySingletonBean().hashCode());
//        System.out.println("================== Prototype Bean==================");
//        System.out.println(myConfig.getMyPrototypeBean().hashCode());
//        System.out.println(myConfig.getMyPrototypeBean().hashCode());
//
//        System.out.println("================== Request Bean==================");
//        System.out.println(myConfig.getMyRequestBean().hashCode());
//        System.out.println(myConfig.getMyRequestBean().hashCode());
//    }
}