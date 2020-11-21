/*      x= ("Enter your first number :"))

        x= ("Enter your second number :"))

        if x==y:

        print("Its a square")

        else :

        print("its an rectangle")*/

package homeworks.agasthya;
import java.util.Scanner;
public class Homework2SquareOrNot{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length:");
        int x = s.nextInt();
        System.out.println("Enter breadth:");
        int y = s.nextInt();
        if(x==y){
            System.out.println("Square");
        }
        else{
            System.out.println("Rectangle");
        }
    }
}

/*x=int(input("Enter your first number :"))

        x=int(input("Enter your second number :"))

        if x==y:

        print("Its a square")

        else :

        print("its an rectangle")*/
