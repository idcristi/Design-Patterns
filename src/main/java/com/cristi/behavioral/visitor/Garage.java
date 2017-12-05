package com.cristi.behavioral.visitor;

public class Garage implements RealEstate {
    @Override
    public void rent(RealEstateVisitor visitor) {
        visitor.visit(this);
    }
}
