package com.cristi.structural.bridge;

public class House extends Estate{
    public House(Style style){
        super(style);
    }

    @Override
    void rentEstate() {
        System.out.print("Rent house in ");
        style.rent();
    }
}
