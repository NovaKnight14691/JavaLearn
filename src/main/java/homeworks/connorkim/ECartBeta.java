package homeworks.connorkim;

import java.util.Scanner;

public class ECartBeta {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("What is the correct way to declare a variable to store an integer value in Java?");
        System.out.println("a. int 1x =10;");
        System.out.println("b. int x = 10;");
        System.out.println("d. float x =10.07");
        System.out.println("c. String = bruh");


        String answer = input.nextLine();

        switch(answer){
            case a:
            case d:
            case c:
                System.out.println("Wrong");
                break;
            case b:
                System.out.println("Correct");
                break;
            default;
                System.out.println("Wow you're dumb");
                break;

        }

    }

}
