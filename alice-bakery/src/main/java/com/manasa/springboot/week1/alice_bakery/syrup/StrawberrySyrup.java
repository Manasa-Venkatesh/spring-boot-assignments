package com.manasa.springboot.week1.alice_bakery.syrup;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "syrup.type", havingValue = "strawberry")
public class StrawberrySyrup implements Syrup{
    @Override
    public String getSyrupType() {
        return "Strawberry syrup";
    }
}
