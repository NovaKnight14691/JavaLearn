package homeworks.agasthya;
import java.util.Scanner;

class Homework2NumbersBackwardsAndForwards{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number you want reversed:");
        int x = s.nextInt();

        int first_digit = (x/1)%10;
        int second_digit = (x/10)%10;
        int third_digit = (x/100)%10;
        int fourth_digit = (x/1000)%10;
        int fifth_digit = (x/10000)%10;
        int sixth_digit = (x/100000)%10;
        //I added 6 so you can see that it is "upgradable" in terms of how many numbers you can enter
        //add as many digits by adding zeros but also add an extra zero per digit for the int backwards_number
        //You also got to edit the multiply number below so the smallest number = 1 so it doesn't add zeros at the end
        int backwards_number = (first_digit*100000)+(second_digit*10000)
                +(third_digit*1000)+(fourth_digit*100)+(fifth_digit*10)+(sixth_digit*1);
        System.out.println(backwards_number);
    }
}



