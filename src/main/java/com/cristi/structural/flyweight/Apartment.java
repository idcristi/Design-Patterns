package com.cristi.structural.flyweight;

public class Apartment implements Estate {
    private String type = "apartment";

    @Override
    public void rentEstate(String price) {
        System.out.println("Rent an " + type + " with " + price + " $");
    }
}
