package homeworks.connorkim;

import java.util.Scanner;

public class SquareOrNot {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Input the length of you rectangle");

        int length =input.nextInt();

        System.out.println("Input the breadth of your rectangle");

        int breadth = input.nextInt();

        if(length == breadth){
            System.out.println("it is a square");
        } else {
            System.out.println("it is not a square");

        }
    }
}
