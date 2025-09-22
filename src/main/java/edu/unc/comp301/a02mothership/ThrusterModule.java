

package edu.unc.comp301.a02mothership;

public class ThrusterModule extends AModule {
    private int fuel = 100;
    private boolean lastFired;
    public ThrusterModule(String moduleName) {
        super(moduleName);
    }
    @Override
    public void statusReport(String moduleStatus, boolean isSuccessful){
        System.out.println(this.getName() + ": " + this.fuel + " units of fuel remaining. Last fired: " + this.lastFired);
        super.statusReport(moduleStatus, isSuccessful);
    }

    public boolean thrust(int availablePower){
        if (this.fuel >= 5 && availablePower >= 5) {
            this.fuel -= 5;
            this.lastFired = true;
            System.out.println("ALERT Captain: 5 fuel used for propulsion maneuver.");
            return true;
        } else {
            System.out.println("ThrusterModule: Not enough power or fuel to fire.");
            return false;
        }
    }
}
