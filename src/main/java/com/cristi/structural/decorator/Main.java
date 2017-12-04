package com.cristi.structural.decorator;

public class Main {

    public static void main(String args[]) {
        Room room = new CurtainDecorator(new ColorDecorator(new ModernRoom()));
        System.out.println(room.showRoom());
    }
}
