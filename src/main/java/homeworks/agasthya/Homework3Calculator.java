package homeworks.agasthya;

import java.util.Scanner;

public class Homework3Calculator {

    public static void main(String[] args) {

        float number1, number2; //Used float because you can use decimal places
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number you want to calculate:");
        number1 = scanner.nextFloat();
        System.out.print("Enter second number you want to calculate:");
        number2 = scanner.nextFloat();
        System.out.print("Enter the operator you want to use (-, +, /, *): ");
        char x = scanner.next().charAt(0);


        float output;

        switch(x)
        {
            case '+':
                output = number1 + number2;
                break;

                case '-':
                    output = number1 - number2;
                    break;

                    case '*':
                        output = number1 * number2;
                        break;

                        case '/':
                            output = number1 / number2;
                            break;

                            default:
                                System.out.println("You have entered something that did not meet the conditions");
                                return;
        }

        System.out.println(number1+" "+x+" "+number2+": "+output);
    }
}