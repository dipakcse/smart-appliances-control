package com.smart.appliances.control;

// Handles annual system update operation.
public class AnnualUpdateService {
    private final AllAppliances allAppliances;

    public AnnualUpdateService(AllAppliances allAppliances) {
        this.allAppliances = allAppliances;
    }

    // Performs the appliance shutdown for the annual update.
    public void performAnnualUpdate() {
        allAppliances.turnOffAll();
    }
}
