package com.cristi.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class PaymentList {
    List<Estate> estate;

    public PaymentList() {
        this.estate = new ArrayList<Estate>();
    }

    public void add(Estate estate){
        this.estate.add(estate);
    }

    public int calculate() {
        int sum = 0;
        for (Estate price : estate) {
            sum += price.getPrice();
        }
        return sum;
    }

    public void pay(Payment paymentMethod){
        int amount = calculate();
        paymentMethod.pay(amount);
    }
}
