package edu.unc.comp301.a02mothership;

public class AlienGenerator extends AModule implements IPowerGenerator {
    // alien bacteria energy generator
    private int aliens;
    private int alienpower;
    private boolean alienrevolt;

    public AlienGenerator() {
        super("Alien Generator");
        this.aliens = 0;
        this.alienpower = 0;
    }

    public int findAliens(){
        // find a random number of aliens
        aliens += (int)(Math.random() * 5);
        return aliens;
    }

    @Override
    public int generatePower() {
        // 10 units of power per alien
        int temp = this.aliens;
        this.aliens = 0;
        return temp;
    }

    @Override
    public void statusReport(String moduleName, boolean workingCorrectly) {
        System.out.println("We have " + this.aliens + " aliens on the ship");
        if (this.alienrevolt) {
            System.out.println("Attention! Lock down! Alien bacteria has escaped the labs!");
        } else {
            System.out.println(moduleName + " Continue searching for alien bacteria!");
        }

    }
}
