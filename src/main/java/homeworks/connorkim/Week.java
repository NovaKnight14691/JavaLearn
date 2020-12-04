package homeworks.connorkim;

import java.util.Scanner;

public class Week {

    public static void main(String[] arg){

        Scanner input = new Scanner(System.in);

        System.out.println("Input a number 1-7:");

        int number = input.nextInt();

        switch (number){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
            default:
                break;
        }

        switch(number){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("That's not a Day Stupid");
                break;
        }

    }

}
