package com.cristi.behavioral.visitor;

public class Apartment implements RealEstate{
    @Override
    public void rent(RealEstateVisitor visitor) {
        visitor.visit(this);
    }
}
