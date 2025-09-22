
package edu.unc.comp301.a02mothership;

import java.util.ArrayList;

public class Mothership {
    private IPowerGenerator powerGenerator;
    private ThrusterModule thrusterModule;
    private ExperimentModule experimentModule;
    private AlienGenerator alienGenerator;

    private ArrayList<IModule> moduleList = new ArrayList<IModule>();
    public Mothership(IPowerGenerator powerGenerator, ThrusterModule thrusterModule, ExperimentModule experimentModule){
        this.powerGenerator = powerGenerator;
        this.thrusterModule = thrusterModule;
        this.experimentModule = experimentModule;
        moduleList.add(powerGenerator);
        moduleList.add(thrusterModule);
        moduleList.add(experimentModule);
    }

    public Mothership(IPowerGenerator powerGenerator, ThrusterModule thrusterModule, ExperimentModule experimentModule, AlienGenerator alienGenerator){
        this.powerGenerator = powerGenerator;
        this.thrusterModule = thrusterModule;
        this.experimentModule = experimentModule;
        this.alienGenerator = alienGenerator;
        moduleList.add(powerGenerator);
        moduleList.add(thrusterModule);
        moduleList.add(experimentModule);
        moduleList.add(alienGenerator);
    }

    public int requestPower(){
        return powerGenerator.generatePower();
    }
    public boolean fireThruster(int availablePower){
        return thrusterModule.thrust(availablePower);
    }
    public void runExperiment() {
        experimentModule.runExperiment();
    }
    public void findAliens() { alienGenerator.findAliens(); }

    public String getExperimentSummary() {
        return experimentModule.getSummary();
    }
    public void printStatusReports(){
        this.powerGenerator.statusReport("Normal", true);
        this.thrusterModule.statusReport("Normal", true);
        this.experimentModule.statusReport("Normal", true);
        this.alienGenerator.statusReport("Normal", true);
    }
}
