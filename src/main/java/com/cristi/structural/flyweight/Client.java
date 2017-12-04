package com.cristi.structural.flyweight;

public class Client {
    public static void main(String[] args) {
        Estate appartment = EstateFactory.getEstate();
        appartment.rentEstate("500");

    }
}
