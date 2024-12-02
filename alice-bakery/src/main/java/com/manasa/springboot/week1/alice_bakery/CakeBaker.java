package com.manasa.springboot.week1.alice_bakery;

import com.manasa.springboot.week1.alice_bakery.frosting.Frosting;
import com.manasa.springboot.week1.alice_bakery.syrup.Syrup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker {

    @Autowired
    private Frosting frosting;

    @Autowired
    private Syrup syrup;

    public void bakeCake(){
        System.out.println("baking cake using "+frosting.getFrostingType()+" and "+syrup.getSyrupType());
    }
}
