package homeworks.connorkim;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        Random random = new Random();

        int upperbound = 10;

        int int_random = random.nextInt(upperbound);

        System.out.println(int_random);

        System.out.println("Try and guess a number between 1-10.");

        int guess = input.nextInt();

        boolean right = false;



        while(right = true){
            if (guess < int_random){
                System.out.println("Too Low, Try Again");
                guess = input.nextInt();
            } else if (guess > int_random){
                System.out.println("Too High, Try Again");
                guess = input.nextInt();
            } else{
                System.out.println("Your Brain is Massive");
                break;

            }
        }
    }
}
