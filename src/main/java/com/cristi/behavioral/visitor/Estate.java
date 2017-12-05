package com.cristi.behavioral.visitor;

public class Estate implements RealEstate{
    RealEstate[] estate;
    public Estate(){
        this.estate = new RealEstate[]{
                new House(), new Apartment()
        };
    }

    @Override
    public void rent(RealEstateVisitor visitor) {
        for(RealEstate e:estate){
            e.rent(visitor);
        }
        visitor.visit(this);
    }
}
