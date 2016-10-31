package com.example;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class ExampleBean {

    public String greet() {
        return "hello!";
    }
}
