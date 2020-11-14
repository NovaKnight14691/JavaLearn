package homeworks.connorkim;

import java.util.Scanner;

public class AngleProgramConnor {
    public static void main(String[] arg){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Any Angle:");

        int angle = input.nextInt();

        if(angle <= 180 && angle > 90){
            System.out.println("Obtuse");
        } else if(angle < 90 && angle > 0){
            System.out.println("Acute");
        } else {
            System.out.println("Right Angle");
        }

    }
}
