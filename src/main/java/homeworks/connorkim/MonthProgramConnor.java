package homeworks.connorkim;

import java.util.Scanner;

public class MonthProgramConnor {
    public static void main(String[] arg){
        Scanner input2 = new Scanner(System.in);

        System.out.println("Enter Any Month (Number Values only)");

        int month = input2.nextInt();

        if(month == 2){
            System.out.println("29");
        }else if (month % 2 == 1){
            System.out.println("31");
        }else{
            System.out.println("30");
        }

    }
}
