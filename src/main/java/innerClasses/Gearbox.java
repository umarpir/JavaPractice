package main.java.innerClasses;

import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears;
    int maxGears;
    int currentGear = 0;
    private Boolean clutchIsIn;

    public Gearbox(int maxGears){
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0,0.0);
        gears.add(neutral);

        for(int i=0;i<maxGears;i++){
            addGear(i,i*5.3);
        }
    }
    public void  operateClutch_(Boolean  in){
        this.clutchIsIn = in;
    }

    public void addGear(int number, double ratio){
        if((number>0)&&(number<=maxGears)){
            this.gears.add(new Gear(number,ratio));
        }
    }

    public void changeGear(int newGear){
        if ((newGear>=0)&& (newGear<this.gears.size())&& this.clutchIsIn){
            this.currentGear = newGear;
        } else {
            System.out.println("GRIND!!!!");
        }
    }

    public double WheelSpeed(int revs){
        if (clutchIsIn){
            System.out.println("SCREAM!!");
            return  0.0;
        }
        return revs * gears.get(currentGear).getRatio();
    }
    private class Gear {
        private int gearNumber;
        private double ratio;
        public Gear(int gearNumber, double ratio){
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }
        public double getRatio() {
            return ratio;
        }

        public double driveSpeed(int revs){
            return revs *(this.ratio);
        }
    }
}
