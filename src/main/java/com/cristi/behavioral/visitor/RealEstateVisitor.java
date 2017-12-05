package com.cristi.behavioral.visitor;

public interface RealEstateVisitor {
    void visit(Apartment apartment);
    void visit(House house);
    void visit(Office office);
    void visit(Garage garage);
    void visit(Estate estate);
}
