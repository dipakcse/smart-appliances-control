package com.smart.appliances.control;

public class Fan implements Appliances{
    public static final int OFF = 0;
    private int speed;

    public Fan() {
        this.speed = OFF;
    }

    public void setSpeed(int speed) {
        if (speed < 0 || speed > 2) {
            throw new IllegalArgumentException(
                    "Please set speed between 0, 1, or 2"
            );
        }

        this.speed = speed;
    }

    public void reduceSpeed(int speed) {
        if (speed == 0) {
            this.speed = OFF;
        } else {
            speed--;
        }
    }
    @Override
    public void turnOff() {
        this.speed = OFF;
    }

    public int getSpeed() {
        return speed;
    }
}
