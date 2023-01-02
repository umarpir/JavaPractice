package main.java.inheritance;

public class SubClass extends SuperClass{
    String subclassExample1;
    String subclassExample2;
    String subclassExample3;


    public SubClass(String example1, String example2, String example3,String subclassExample1,String subclassExample2,
            String subclassExample3) {
        super(example1, example2, example3);
        this.subclassExample1 = subclassExample1;
        this.subclassExample2 = subclassExample2;
        this.subclassExample3 = subclassExample3;

    }
}
