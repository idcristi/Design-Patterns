package com.cristi.behavioral.visitor;

public class House implements RealEstate {
    @Override
    public void rent(RealEstateVisitor visitor) {
        visitor.visit(this);
    }
}
