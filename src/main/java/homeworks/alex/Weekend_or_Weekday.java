package homeworks.alex;

import java.util.Scanner;

public class Weekend_or_Weekday {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number 1-7:");
        String num = input.nextLine();

        switch (num) {
            case "1":
                System.out.println("Sunday");
                System.out.println("Weekend");
                break;
            case "2":
                System.out.println("Monday");
                System.out.println("Weekday");
                break;
            case "3":
                System.out.println("Tuesday");
                System.out.println("Weekday");
                break;
            case "4":
                System.out.println("Wednesday");
                System.out.println("Weekday");
                break;
            case "5":
                System.out.println("Thursday");
                System.out.println("Weekday");
                break;
            case "6":
                System.out.println("Friday");
                System.out.println("Weekday");
                break;
            case "7":
                System.out.println("Saturday");
                System.out.println("Weekend");
            default:
                System.out.println("Number is out of requested range.");
                break;
        }
    }
}
