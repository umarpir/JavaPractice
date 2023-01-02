package main.java.innerClasses;

import java.util.Scanner;

public class InnerClass {
        private static Scanner sc = new Scanner(System.in);
        private static Button btnPrint = new Button("print");
    public static void main(String[] args) {

        class Clicklisten implements Button.OnClickListener{
            public Clicklisten() {
                System.out.println("ive been attached");
            }

            @Override
            public void onClick( String title) {
                System.out.println(title + "was clicked");
            }
        }

        btnPrint.setListener(new Clicklisten());


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
