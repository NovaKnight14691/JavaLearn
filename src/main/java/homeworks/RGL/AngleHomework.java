package homeworks.RGL;

import java.util.Scanner;

public class AngleHomework {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Type an angle measurement please");
        int x = input.nextInt();
        if (x == 0 || x == 180 || x == -180) {
            System.out.println("That is a line");
        } else if (x <= 89 && x >= -89) {
            System.out.println("Acute Angle");
        } else if (x >= 91 && x <= 359) {
            System.out.println("Obtuse Angle");
        } else if (x == 90 || x == -90) {
            System.out.println("Right Angle");
        } else if (x <= -360 || x >= 360) {
            System.out.println("That is not an angle");
        }
    }

}
