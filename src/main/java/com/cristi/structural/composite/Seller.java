package com.cristi.structural.composite;

public class Seller implements User {
    @Override
    public void buy() {

    }

    @Override
    public void sell() {
        System.out.println("Owner sell a house or an apartment");
    }
}
