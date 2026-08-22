package com.smart.appliances.control;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class FanTest {
    private Fan fan;

    @BeforeEach
    void setUp(){
        fan = new Fan();
    }

    @Test
    void testTurnOffBySettingSpeedToZero() {
        fan.setSpeed(2);

        fan.turnOff();

        assertEquals(0, fan.getSpeed());
    }


    @Test
    void testReduceSpeed() {
        fan.reduceSpeed(1);
        assertEquals(0, fan.getSpeed());

        fan.reduceSpeed(2);
        assertEquals(0, fan.getSpeed());

    }

    @Test
    void testInvalidSpeed() {
        assertThrows(
                IllegalArgumentException.class,
                () -> fan.setSpeed(3)
        );
    }

}
