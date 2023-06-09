package org.mk.beanscopes.controller;

import org.mk.beanscopes.service.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class MyController {

    @Autowired
    private Customer customer;

    @RequestMapping("/request")
    public String helloRequestScope(){
        return customer.getRequestScope().getName();
    }

    @RequestMapping("/sessionScope")
    public String helloSessionScope(){
        return customer.getSessionScope().getName();
    }

    @RequestMapping("/sessionScopeUpdate")
    public String helloSessionScopeUpdate(){
        customer.getSessionScope().setName("session scope updated");
        return customer.getSessionScope().getName();
    }


}
