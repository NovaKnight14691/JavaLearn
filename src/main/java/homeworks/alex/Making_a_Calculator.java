package homeworks.alex;

import java.util.Scanner;

public class Making_a_Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int num1 = input.nextInt();

        System.out.println("Enter Operation");
        String operation = input.next();

        System.out.println("Enter Another Number:");
        int num2 = input.nextInt();

        switch (operation) {
            case "+":
                System.out.println(num1+" "+operation+" "+num2+" = "+(num1+num2));
                break;
            case "-":
                System.out.println(num1+" "+operation+" "+num2+" = "+(num1-num2));
                break;
            case "*":
                System.out.println(num1+" "+operation+" "+num2+" = "+(num1*num2));
                break;
            case "/":
                System.out.println(num1+" "+operation+" "+num2+" = "+(num1/num2));
                break;
            case "%":
                System.out.println(num1+" "+operation+" "+num2+" = "+(num1%num2));
                break;
            default:
                System.out.println("Not A Valid Operation");
                break;
        }
    }
}