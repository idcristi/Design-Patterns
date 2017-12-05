package com.cristi.behavioral.state;

public class Client {
    public static void main(String[] args) {
        Apartment apartment = new Apartment();
        AvailableState availableState = new AvailableState();
        availableState.status(apartment);
        System.out.println(apartment.getState().toString());

        UnavailableState unavailableState = new UnavailableState();
        unavailableState.status(apartment);
        System.out.println(apartment.getState().toString());
    }
}
