package com.smart.appliances.control;

public class Light implements Appliances{
    private boolean on;

    public Light() {
        this.on = false;
    }

    public void turnOn() {
        this.on = true;
    }

    @Override
    public void turnOff() {
        this.on = false;
    }

    public boolean isOn() {
        return on;
    }
}
