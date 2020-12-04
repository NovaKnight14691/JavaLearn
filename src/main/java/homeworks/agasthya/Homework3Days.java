package homeworks.agasthya;
import java.util.Scanner;
public class Homework3Days {


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
                break;
            case 2:
                NameOfTheDay = "Monday";
                break;
            case 3:
                NameOfTheDay = "Tuesday";
                break;
            case 4:
                NameOfTheDay = "Wednesday";
                break;
            case 5:
                NameOfTheDay = "Thursday";
                break;
            case 6:
                NameOfTheDay = "Friday";
                break;
            case 7:
                NameOfTheDay = "Saturday";
                break;
            default:NameOfTheDay = "Invalid Day";
        }

        return NameOfTheDay;
    }
}