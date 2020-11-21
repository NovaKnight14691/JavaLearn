package homeworks.alex;

import java.util.Scanner;

public class ConditionalHomework1 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter Length of Polygon:");
            int x = input.nextInt();

            System.out.println("Enter Breadth of Polygon:");
            int y = input.nextInt();

            if (x == y) {
                System.out.println("This Shape is a Square");

            } else {
                System.out.println("This Shape is a Rectangle");

            }
        }
    }
