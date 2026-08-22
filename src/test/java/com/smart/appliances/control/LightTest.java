package com.smart.appliances.control;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class LightTest {

    private Light light;

    @BeforeEach
    void setUp(){
        light = new Light();
    }

    @Test
    void testTurnLightOff() {
        light.turnOn();
        assertTrue(light.isOn());

        light.turnOff();

        assertFalse(light.isOn());
    }
}
