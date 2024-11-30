package com.example.dk.week1.Week1HomeWork;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "deploy.env1",havingValue = "strawberryFrosting")
public class StrawberryFrosting implements Frosting{
    @Override
    public String getFrostingType() {
        return "strawberry frosting";
    }
}
