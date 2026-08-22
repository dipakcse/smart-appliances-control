package com.smart.appliances.control;

/**
 * Represents fan functionality.
 * here Fan speeds:
 * 0 = Off
 * 1 = Low
 * 2 = High
 */
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

     /**
     * A fan is turned off by reducing its speed to zero.
     */
    public void reduceSpeed(int speed) {
        if (speed == 0) {
            this.speed = OFF;
        } else {
            speed--;
        }
    }
      
    /**
     * a fan is turned of when speed is zero.
     */
    @Override
    public void turnOff() {
        this.speed = OFF;
    }

    public int getSpeed() {
        return speed;
    }
}
