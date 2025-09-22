package edu.unc.comp301.a02mothership;

public abstract class AModule implements IModule {
    private String moduleName;
    public AModule(String moduleName) {
        this.moduleName = moduleName;
    }
    public String getName() {
        return this.moduleName;
    }
    public void statusReport(String moduleStatus, boolean isSuccessful) {
        System.out.println(this.moduleName + " is Initializing");
        if (isSuccessful) {
            System.out.println("Action Successful.");
        } else {
            System.out.println(this.moduleName + " needs immediate attention!");
        }

    }
}


