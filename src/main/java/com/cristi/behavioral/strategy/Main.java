package com.cristi.behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        PaymentList paymentList = new PaymentList();

        Estate estate1 = new Estate("House",2000);
        Estate estate2 = new Estate("Apartment",700);

        paymentList.add(estate1);
        paymentList.add(estate2);
        paymentList.pay(new Cash("Cristi","User","06677799"));
        paymentList.pay(new CreditCard("Cristi","0123456789","777","12/18"));
    }
}
