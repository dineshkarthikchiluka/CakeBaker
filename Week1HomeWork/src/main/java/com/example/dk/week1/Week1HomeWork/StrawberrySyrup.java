package com.example.dk.week1.Week1HomeWork;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "deploy.env2",havingValue = "strawberrySyrup")
public class StrawberrySyrup implements Syrup{
    @Override
    public String getSyrupType() {
        return "strawberry syrup";
    }
}
