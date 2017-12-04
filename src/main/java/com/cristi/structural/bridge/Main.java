package com.cristi.structural.bridge;

public class Main {
    public static void main(String[] args) {

        Style style = new ModernStyle();
        Estate estate = new Apartment(style);
        estate.rentEstate();

        style = new ClassicStyle();
        estate = new House(style);
        estate.rentEstate();

    }
}
