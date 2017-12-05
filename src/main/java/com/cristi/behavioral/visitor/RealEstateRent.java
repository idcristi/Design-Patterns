package com.cristi.behavioral.visitor;

public class RealEstateRent implements RealEstateVisitor {
    @Override
    public void visit(Estate estate) {}

    @Override
    public void visit(Apartment apartment) {
        System.out.println("Rent an apartment");
    }

    @Override
    public void visit(House house) {
        System.out.println("Rent a house");
    }

    @Override
    public void visit(Garage garage) {
        System.out.println("Rent a garage");
    }

    @Override
    public void visit(Office office) {
        System.out.println("Rent a office");
    }

}
