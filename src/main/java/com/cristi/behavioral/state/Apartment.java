package com.cristi.behavioral.state;

public class Apartment {
    private State state;

    public Apartment(){
        state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

}
