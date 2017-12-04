package com.cristi.structural.bridge;

abstract class Estate {
    Style style;
    public Estate(Style style){
        this.style = style;
    }
    abstract void rentEstate();
}