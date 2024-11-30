package com.example.dk.week1.Week1HomeWork;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "deploy.env1",havingValue = "chocolateFrosting")
public class ChocolateFrosting implements Frosting{

    @Override
    public String getFrostingType() {
        return "chocolate frosting";
    }
}
