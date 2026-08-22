package com.smart.appliances.control;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {
    private AirConditioner airConditioner;

    @BeforeEach
    void setUp(){
        airConditioner = new AirConditioner();
    }

    @Test
    void testTurnThermostatOff() {

        airConditioner.turnOn();
        assertTrue(airConditioner.isThermostatOn());

        airConditioner.turnOff();
        assertFalse(airConditioner.isThermostatOn());
    }
}
