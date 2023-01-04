package main.java.interfaces;

public class Main{

    public static void main(String[] args) {
        ITelephone printlambda = (s) -> "printing lambda";
        printThing(printlambda);
    }
    static void printThing(ITelephone thing){
        thing.dial("!");
    }
}
