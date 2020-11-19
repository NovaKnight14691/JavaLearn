package homeworks.connorkim;

import java.util.Scanner;

public class Swap {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("input a 4 digit number:");

        int number = input.nextInt();

        int lastdigit = number % 10;

        int firstthree = ((number - lastdigit)/10);

        int third = firstthree%10;

        int firsttwo = (firstthree - third)/10;

        int second = firsttwo%10;

        int first = (firsttwo-second)/10;

        System.out.println(lastdigit+""+third+""+second+""+first);
    }

}
