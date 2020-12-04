package homeworks.connorkim;

import java.util.Scanner;

public class Calculator {

    public static void main(String arg[]){

        Scanner input = new Scanner(System.in);

        System.out.println("Input your Operator:");

        String operator = input.nextLine();

        System.out.println("Input your first number:");

        int firstValue = input.nextInt();

        System.out.println("Input Your Second Number:");

        int secondValue = input.nextInt();




        switch(operator){
            case "+":
                System.out.println(firstValue+secondValue);
                break;

            case "*":
                System.out.println(firstValue*secondValue);
                break;

            case "-":
                System.out.println(firstValue-secondValue);
                break;

            case "/":
                System.out.println(firstValue/secondValue);
                break;

            case "%":
                System.out.println(firstValue%secondValue);
                break;

            default:
                System.out.println("Please input an actual operator");

        }
    }
}
