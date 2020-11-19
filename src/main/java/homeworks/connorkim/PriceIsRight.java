package homeworks.connorkim;

import java.util.Scanner;

public class PriceIsRight {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Quantity You Purchased:");

        int q = input.nextInt();

        if(q <= 1000){

            int p = q * 100;

            System.out.println("Please Pay" );
            System.out.println(p);

        } else if (q > 1000){

            double p = (q * 100)*0.9;

            System.out.println("Please Pay");
            System.out.println(p);
        }else{
            System.out.println("Bro how could you not type in numbers!");
        }

    }

}
