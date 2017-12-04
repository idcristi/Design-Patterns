package com.cristi.structural.composite;

public class Main {
    public static void main(String[] args) {
        User buyer = new Buyer();
        User seller = new Seller();
        User agent = new Agent();
        System.out.println("Client");
        buyer.buy();
        System.out.println("\nOwner");
        seller.sell();
        System.out.println("\nAgent");
        agent.sell();
        agent.buy();
    }
}
