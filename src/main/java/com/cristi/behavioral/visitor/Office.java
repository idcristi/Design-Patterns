package com.cristi.behavioral.visitor;

public class Office implements RealEstate {
    @Override
    public void rent(RealEstateVisitor visitor) {
        visitor.visit(this);
    }
}
