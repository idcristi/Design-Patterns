package com.cristi.structural.proxy;

public class ProxyEstate implements Estate {

    @Override
    public void rent() {
        System.out.print("Renting this estate");
    }

    public void checkStatus(){
        System.out.println(" is not available");
    }

}
