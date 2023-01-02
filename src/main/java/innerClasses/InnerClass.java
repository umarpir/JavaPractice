package main.java.innerClasses;

public class InnerClass {

    public static void main(String[] args) {
        Gearbox maclaren = new Gearbox(6);
        maclaren.addGear(1,5.3);
        maclaren.addGear(2,10.3);
        maclaren.addGear(3,15.9);

        maclaren.operateClutch_(true);
        maclaren.changeGear(1);
        maclaren.operateClutch_(false);
        System.out.println(maclaren.WheelSpeed(1000));
        maclaren.changeGear(2);
        System.out.println(maclaren.WheelSpeed(3000));
    }
}
