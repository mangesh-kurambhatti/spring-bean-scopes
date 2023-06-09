package org.mk.beanscopes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {

    @Autowired
    private MyRequestScope requestScope;

    @Autowired
    private MySessionScope sessionScope;

    public MyRequestScope getRequestScope() {
        return requestScope;
    }

    public void setRequestScope(MyRequestScope requestScope) {
        this.requestScope = requestScope;
    }

    public MySessionScope getSessionScope() {
        return sessionScope;
    }

    public void setSessionScope(MySessionScope sessionScope) {
        this.sessionScope = sessionScope;
    }
}
