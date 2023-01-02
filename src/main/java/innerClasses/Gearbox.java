package main.java.innerClasses;

import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears;
    int maxGears;
    int gearNumber;

    public Gearbox(int maxGears){
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear();
        gears.add(neutral);
    }

}
