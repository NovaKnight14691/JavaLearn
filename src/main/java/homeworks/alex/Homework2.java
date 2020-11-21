package homeworks.alex;

import java.util.Scanner;

public class Homework2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Amount of Units:");
        int x = input.nextInt();

        if (x >= 1000) {
            System.out.println("$" + x * 100 * 0.9);
        } else {
            System.out.println("$" + x * 100);
        }
    }
}
