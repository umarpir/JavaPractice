package main.java.innerClasses;

public class InnerClass {

    public static void main(String[] args) {
        Gearbox maclaren = new Gearbox(6);


        maclaren.operateClutch_(true);
        maclaren.changeGear(1);
        maclaren.operateClutch_(false);
        System.out.println(maclaren.WheelSpeed(1000));
        maclaren.changeGear(2);
        System.out.println(maclaren.WheelSpeed(3000));
        System.out.println("test changes");
        System.out.println("test changes");
    }
}
