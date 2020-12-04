package homeworks.agasthya;
import java.util.Scanner;
public class Homework3DaysWithWeekDayOrWeekend {


    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the number you want for the day: ");
        int day = in.nextInt();

        System.out.println(TheNameOfTheDay(day));
    }



    public static String TheNameOfTheDay(int day) {
        String NameOfTheDay = " ";
        switch (day) {
            case 1:
                NameOfTheDay = "Sunday";
                System.out.println("Weekend");
                break;
            case 2:
                NameOfTheDay = "Monday";
                System.out.println("Weekday");
                break;
            case 3:
                NameOfTheDay = "Tuesday";
                System.out.println("Weekday");
                break;
            case 4:
                NameOfTheDay = "Wednesday";
                System.out.println("Weekday");
                break;
            case 5:
                NameOfTheDay = "Thursday";
                System.out.println("Weekday");
                break;
            case 6:
                NameOfTheDay = "Friday";
                System.out.println("Weekday");
                break;
            case 7:
                NameOfTheDay = "Saturday";
                System.out.println("Weekend");
                break;
            default:NameOfTheDay = "Invalid Day";
                break;
        }


        return NameOfTheDay;

    }
}