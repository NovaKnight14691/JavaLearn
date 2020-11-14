package homeworks.connorkim;

import java.util.Scanner;

public class Connor {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Input Grade Here! :");
        int g = input.nextInt();



        if( g >= 90 && g <= 100) {

            System.out.println("A");
        }else if(80 <= g && g <= 89){

            System.out.println("B");
        } else if (70 <= g && g <= 79){

            System.out.println("C");

        } else if (60 <= g && g <= 69){

            System.out.println("D");
        } else {

            System.out.println("F");
        }



    }


    }

