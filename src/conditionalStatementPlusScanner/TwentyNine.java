package conditionalStatementPlusScanner;

import java.util.Scanner;

/* For you to do:
    Write a java program that prints out true if ( x * y ) returns a positive value. Else prints out false if  (x * y) returns a negative value.
    Step 1: Your program should ask "Please enter first number" - for the 1st number and "Please enter second number" - for the 2nd number.
    Step 2: Create if condition to check if the multiplication of x and y values is positive or negative.
    If the result of a multiplication is positive print true, otherwise print false.

    **Example Output:**
    Please enter first number
    Please enter second number
    true

    **Example Output:**
    Please enter first number
    Please enter second number
    false
    **IMPORTANT: Must use a Scanner class**
 */
public class TwentyNine {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1=scanner.nextInt();
        System.out.println("Please enter second number");
        int num2=scanner.nextInt();

        int result=num1*num2;
        if (result>=0){
            System.out.println("true");
        } else if (result<0){
            System.out.println("false");
        }
    }
}
