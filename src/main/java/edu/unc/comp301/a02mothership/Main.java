package edu.unc.comp301.a02mothership;

public class Main {
    public void main(String[] args){
        FuelGenerator powerGenerator = new FuelGenerator(20);
        ThrusterModule thrusterModule = new ThrusterModule("thruster");
        double[] experimentDouble = {2.0, 3.0};
        ExperimentModule experimentModule = new ExperimentModule("experi", experimentDouble);
        Mothership mothership = new Mothership(powerGenerator, thrusterModule, experimentModule);
        int power = mothership.requestPower();
        mothership.fireThruster(power);
        mothership.runExperiment();
        mothership.printStatusReports();
    }
}
