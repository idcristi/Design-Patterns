package com.cristi.behavioral.state;

public class AvailableState implements State {
    @Override
    public void status(Apartment apartment) {
        System.out.println("This apartment is available");
        apartment.setState(this);
    }

    @Override
    public String toString() {
        return "Available apartment";
    }
}
