package com.smart.appliances.control;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class AllAppliancesTest {

    @Test
    void testTurnOffAllAppliances() {

        Light light = new Light();
        Fan fan = new Fan();
        AirConditioner airConditioner = new AirConditioner();

        light.turnOn();
        fan.setSpeed(2);
        airConditioner.turnOn();

        AllAppliances controller =
                new AllAppliances(
                        List.of(light, fan, airConditioner)
                );

        controller.turnOffAll();

        assertFalse(light.isOn());
        assertEquals(0, fan.getSpeed());
        assertFalse(airConditioner.isThermostatOn());
    }
}
