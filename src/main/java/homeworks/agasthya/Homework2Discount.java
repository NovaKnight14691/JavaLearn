/*A shop will give a discount of 10% if the cost of the purchased quantity is
more than 1000. Ask the user for
the quantity and judge and print the total cost for the user
 (assume that one unit will cost $100)

 nextint()=stores integer value
 x is the number that you you put into the scanner
 if the number of products is over 1000 then it moves on the the next statement if not, then it
 goes to the else statement
 Discount is 0.1 = 10% multiplied the the input value multiplied by 100 because that how much the
  product costs. The total cost is input x 100 which is the cost without discount minus the discount
 */

package homeworks.agasthya;
import java.util.Scanner;
public class Homework2Discount{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of products:");
        int x = s.nextInt();
        if((x)>1000){
            System.out.println("The discount is "+(.10*x*100)+" total cost is "+(x*100-(.10*x*100)));
        }
        else{
            System.out.println("You did not meet the requirements for the discount");
        }
    }
}






