package com.example.dk.week1.Week1HomeWork;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker {

    @Autowired
    private Syrup syrup;
    @Autowired
    private Frosting frosting;

    String bakeCake(){
        String syrupType = syrup.getSyrupType();
        String frostingType = frosting.getFrostingType();
        return "Baked the cake with "+ syrupType+" and "+frostingType;
    }
}
