package homeworks.agasthya;
import java.util.Scanner;
public class Homework3DaysWithWeekDayOrWeekend {


    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the number you want for either weekday or weekend: ");
        int day = in.nextInt();


        System.out.println(TheNameOfTheDay(day));
    }


    public static String TheNameOfTheDay(int day) {
        String NameOfTheDay = " ";
        switch (day) {
            case 1:
                NameOfTheDay = "Weekend";
                break;
            case 2:
                NameOfTheDay = "Weekday";
                break;
            case 3:
                NameOfTheDay = "Weekday";
                break;
            case 4:
                NameOfTheDay = "Weekday";
                break;
            case 5:
                NameOfTheDay = "Weekday";
                break;
            case 6:
                NameOfTheDay = "Weekday";
                break;
            case 7:
                NameOfTheDay = "Weekend";
                break;
            default:NameOfTheDay = "Invalid input";
                break;
        }




        return NameOfTheDay;

    }
}