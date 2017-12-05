package com.cristi.behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        ConcreteEstate concreteEstate = new ConcreteEstate();
        for (Iterator iterator = concreteEstate.getIterator(); iterator.hasNext(); ) {
            String style = (String) iterator.next();
            System.out.println("Style: " + style);
        }
    }
}
