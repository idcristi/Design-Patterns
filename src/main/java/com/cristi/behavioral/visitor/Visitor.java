package com.cristi.behavioral.visitor;

public class Visitor {
    public static void main(String[] args) {
        RealEstate estate = new Estate();
        estate.rent(new RealEstateRent());
    }
}
