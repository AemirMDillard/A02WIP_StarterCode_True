package edu.unc.comp301.a02mothership;

public class Main {
    public void main(String[] args){
        ThrusterModule thruster = new ThrusterModule();
        thruster.statusReport("Normal", false);


        FuelGenerator powerGenerator = new FuelGenerator(20);
        ThrusterModule thrusterModule = new ThrusterModule();
        AlienGenerator aliener = new AlienGenerator();
        double[] experimentDouble = {2.0, 3.0};
        ExperimentModule experimentModule = new ExperimentModule("experi", experimentDouble);
        Mothership mothership = new Mothership(powerGenerator, thrusterModule, experimentModule, aliener);
        int power = mothership.requestPower();
        mothership.findAliens();
        mothership.fireThruster(power);
        mothership.findAliens();
        mothership.runExperiment();
        mothership.printStatusReports();
    }
}
