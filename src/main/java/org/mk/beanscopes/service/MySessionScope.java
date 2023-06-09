package org.mk.beanscopes.service;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "session",proxyMode = ScopedProxyMode.TARGET_CLASS )
public class MySessionScope {

    String name= "Session Scope";

    public MySessionScope() {
        System.out.println("MySessionScope() default ctr invoked..!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
