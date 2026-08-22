package com.smart.appliances.control;

// Handles annual system update operation.
public class AnnualUpdateService {
    private final AllAppliances allAppliances;

    public AnnualUpdateService(AllAppliances allAppliances) {
        if (allAppliances == null) {
            throw new IllegalArgumentException(
                    "AllAppliances cannot be null"
            );
        }
        this.allAppliances = allAppliances;
    }

    // A scheduler can trigger performAnnualUpdate() at January 1st, 1:00 AM local time and performs the appliance shutdown for the annual update.
    public void performAnnualUpdate() {
        allAppliances.turnOffAll();
    }
}
