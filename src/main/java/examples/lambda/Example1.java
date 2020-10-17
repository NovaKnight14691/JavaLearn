package examples.lambda;

public class Example1 {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("Printing from the Runnable")).start();

    }


}

class CodeToRun implements Runnable {
    @Override
    public void run()
    {
        System.out.println("Printing from the Runnable");
    }
}