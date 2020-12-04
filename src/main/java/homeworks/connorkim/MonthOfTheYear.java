package homeworks.connorkim;

import java.util.Scanner;

public class MonthOfTheYear {

    public static void main(String[] arg){

        Scanner input = new Scanner(System.in);

        System.out.println("Input a number 1-12");

        int number = input.nextInt();

        System.out.println("Please input A year:");

        int year = input.nextInt();


        if(number==2) {
            if ((year % 4) == 0) {
                if ((year % 100) == 0) {
                    if ((year % 400) == 0) {
                        System.out.println("February");
                        System.out.println("29");

                    }else{
                        System.out.println("February");
                        System.out.println("28");
                    }
                }else{
                    System.out.println("February");
                    System.out.println("29");
                }
            }else{
                System.out.println("February");
                System.out.println("28");
            }

        }else{

            switch (number) {
                case 1:
                    System.out.println("January");
                    System.out.println("31");
                    break;
                case 3:
                    System.out.println("March");
                    System.out.println("31");
                    break;
                case 4:
                    System.out.println("April");
                    System.out.println("30");
                    break;
                case 5:
                    System.out.println("May");
                    System.out.println("31");
                    break;
                case 6:
                    System.out.println("June");
                    System.out.println("30");

                    break;
                case 7:
                    System.out.println("July");
                    System.out.println("31");
                    break;
                case 8:
                    System.out.println("August");
                    System.out.println("30");
                    break;
                case 9:
                    System.out.println("September");
                    System.out.println("31");
                    break;
                case 10:
                    System.out.println("October");
                    System.out.println("30");
                    break;
                case 11:
                    System.out.println("November");
                    System.out.println("31");
                    break;
                case 12:
                    System.out.println("December");
                    System.out.println("30");
                    break;
                default:
                    System.out.println("Please Try Again");
                    break;

            }
        }
    }

}
