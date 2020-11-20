package  homeworks.agasthya;
import java.util.Scanner;
class problem2
{
    public static void main(String[] args)
    {
        int month;
        Scanner p=new Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        month=p.nextInt();
        if(month == 1)
        {
            System.out.println("31 days");
        }
        else if(month == 2)
        {
            System.out.println("28 or 29 days on a leap year");
        }
        else if(month == 3)
        {
            System.out.println("31 days");
        }
        else if(month == 4)
        {
            System.out.println("30 days");
        }
        else if(month == 5)
        {
            System.out.println("31 days");
        }
        else if(month == 6)
        {
            System.out.println("30 days");
        }
        else if(month == 7)
        {
            System.out.println("31 days");
        }
        else if(month == 8)
        {
            System.out.println("31 days");
        }
        else if(month == 9)
        {
            System.out.println("30 days");
        }
        else if(month == 10)
        {
            System.out.println("31 days");
        }
        else if(month == 11)
        {
            System.out.println("30 days");
        }
        else if(month == 12)
        {
            System.out.println("31 days");
        }
        else
        {
            System.out.println("Are you stupid? Im asking for a number 1-12");
        }

    }
}
