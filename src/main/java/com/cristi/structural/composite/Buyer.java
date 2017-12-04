package com.cristi.structural.composite;

public class Buyer implements User {
    @Override
    public void buy() {
        System.out.println("Client buy a house or an apartment");
    }

    @Override
    public void sell() {}
}
