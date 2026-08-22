package com.smart.appliances.control;

public class AirConditioner implements Appliances{
    private boolean thermostatOn;

    public AirConditioner() {
        this.thermostatOn = false;
    }

    public void turnOn() {
        this.thermostatOn = true;
    }

    @Override
    public void turnOff() {
        this.thermostatOn = false;
    }

    public boolean isThermostatOn() {
        return thermostatOn;
    }
}
