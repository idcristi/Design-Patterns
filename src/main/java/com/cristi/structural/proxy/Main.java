package com.cristi.structural.proxy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Proxy");
        ProxyEstate estatePr = new ProxyEstate();
        estatePr.rent();
        estatePr.checkStatus();
    }
}
