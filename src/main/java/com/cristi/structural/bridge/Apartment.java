package com.cristi.structural.bridge;

public class Apartment extends Estate {
    public Apartment(Style style){
        super(style);
    }

    @Override
    void rentEstate() {
        System.out.print("Rent apartment in ");
        style.rent();
    }
}
