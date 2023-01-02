package main.java.lambda;

public class Lambda {

    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.run(new Executable() {
            @Override
            public void execute() {
                System.out.println("hello executing");
            }
        });



        runner.run(() -> System.out.println("hello executing easier"));




    }
}
