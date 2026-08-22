package com.smart.appliances.control;
import java.util.List;

//Controls all appliances.
public class AllAppliances {
    // List of appliances managed by this controller.
    private final List<Appliances> appliances;

    public AllAppliances(List<Appliances> appliances) {
        if (appliances == null) {
            throw new IllegalArgumentException("Please provide at least one appliances between Light, Fan, Air Conditioner.");
        }

        this.appliances = List.copyOf(appliances);
    }

    // Turn off all of appliances
    public void turnOffAll() {
        for (Appliances appliance : appliances) {
            appliance.turnOff();
        }
    }
}
