package com.cristi.behavioral.strategy;

public class Cash implements Payment {
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Cash(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + "Cash payment");
    }
}
