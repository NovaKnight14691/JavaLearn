package homeworks.alex;

import java.util.Scanner;

public class Homework3 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter a 4-Digit Number:");
            int x = input.nextInt();

            int digit1 = x % 10;
            int digit2 = (x / 10) % 10;
            int digit3 = (x / 100) % 10;
            int digit4 = (x / 1000) % 10;
            System.out.println(digit1 + "" + digit2 + "" + digit3 + "" + digit4);
        }
    }

