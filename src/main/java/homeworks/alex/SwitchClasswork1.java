package homeworks.alex;

import java.util.Scanner;

public class SwitchClasswork1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Press a number key");
        String x = input.nextLine();

        switch (x) {
            case "0":
                System.out.println("0");
                break;
            case "1":
                System.out.println("1");
                break;
            case "2":
                System.out.println("2");
                break;
            case "3":
                System.out.println("3");
                break;
            case "4":
                System.out.println("4");
                break;
            case "5":
                System.out.println("5");
                break;
            case "6":
                System.out.println("6");
                break;
            case "7":
                System.out.println("7");
                break;
            case "8":
                System.out.println("8");
                break;
            case "9":
                System.out.println("9");
                break;
            default:
                System.out.println("Not allowed");
                break;
        }
    }
}
