package com.example.demo.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class UserServiceImp implements UserService {
    @Override
    public void Print() {
        System.out.println("user service");
    }

    @Override
    public void Foo() {
        System.out.println("foo()");
    }

}
