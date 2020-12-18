package homeworks.connorkim;

import java.util.Scanner;

public class SumOfTheFollowing {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Input Any Number:");

        int n = input.nextInt();

        double answer = 0;

        for(int i = 1; i <= n; i ++){

            answer = answer + 1.0/i;
        }
        System.out.println(answer);
    }
}
