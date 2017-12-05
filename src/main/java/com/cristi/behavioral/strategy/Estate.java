package com.cristi.behavioral.strategy;

public class Estate {
    private String estate;
    private int price;

    public Estate(String estate, int price) {
        this.estate = estate;
        this.price = price;
    }

    public String getEstate() {
        return estate;
    }

    public int getPrice() {
        return price;
    }
}
