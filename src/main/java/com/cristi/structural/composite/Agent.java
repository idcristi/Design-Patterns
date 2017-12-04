package com.cristi.structural.composite;

public class Agent implements User {
    @Override
    public void buy() {
        System.out.println("Agent helps to buy a house or an apartment");
    }

    @Override
    public void sell() {
        System.out.println("Agent helps to sell a house or an apartment");
    }
}
