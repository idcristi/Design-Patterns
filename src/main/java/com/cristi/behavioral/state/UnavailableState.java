package com.cristi.behavioral.state;

public class UnavailableState implements State {
    @Override
    public void status(Apartment apartment) {
        System.out.println("This apartment is unavailable");
        apartment.setState(this);
    }

    @Override
    public String toString() {
        return "Unavailable apartment";
    }
}
