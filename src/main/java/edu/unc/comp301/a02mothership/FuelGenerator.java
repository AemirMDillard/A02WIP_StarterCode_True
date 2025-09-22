package edu.unc.comp301.a02mothership;

public class FuelGenerator extends AModule implements IPowerGenerator {
    private int fuel;
    public FuelGenerator(int fuel){
        super("Fuel Generator");
        this.fuel = fuel;
    }
    public void statusReport(String moduleStatus, boolean isSuccessful){
        System.out.println("Fuel Generator: " + this.fuel + " units of fuel remaining.");
        super.statusReport(moduleStatus, isSuccessful);
    }
    public int generatePower(){
        if (this.fuel <= 0) {
            System.out.println("Fuel Generator is Warning");
            return 0;
        }
        if (this.fuel >= 10) {
            System.out.println("Fuel Generator is Generating Fuel");
            this.fuel -= 10;
            return 10;
        } else {
            System.out.println("Fuel Generator is Generating Fuel");
            int temp = this.fuel;
            this.fuel = 0;
            return temp;
        }
    }


}
