package org.mk.beanscopes.service;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class MyRequestScope {

    private String name ="Request scope";

    public MyRequestScope() {
        System.out.println("MyRequestScope() default ctr invoked..!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
