package homeworks.alex;

import java.util.Scanner;

public class Weekend_or_Weekday {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a day of the week:");
        String day = input.nextLine();

        switch (day) {
            case "Sunday":
                System.out.println("Weekend");
                break;
            case "Monday":
                System.out.println("Weekday");
                break;
            case "Tuesday":
                System.out.println("Weekday");
                break;
            case "Wednesday":
                System.out.println("Weekday");
                break;
            case "Thursday":
                System.out.println("Weekday");
                break;
            case "Friday":
                System.out.println("Weekday");
                break;
            case "Saturday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid answer.");
        }
    }
}
