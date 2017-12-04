package com.cristi.structural.proxy;

public class RealEstate implements Estate {

    @Override
    public void rent() {
        System.out.println("Rent apartment");
    }
}
