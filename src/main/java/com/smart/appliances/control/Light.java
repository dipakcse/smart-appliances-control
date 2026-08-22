package com.smart.appliances.control;

// Light functionality and it is off when power switch false
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
