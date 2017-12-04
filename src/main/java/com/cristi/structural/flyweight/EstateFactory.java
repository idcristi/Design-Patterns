package com.cristi.structural.flyweight;

public class EstateFactory {
    private static Estate estate;
    public static Estate getEstate(){
        if(estate==null){
            estate = new Apartment();
        }
        return estate;
    }

}
