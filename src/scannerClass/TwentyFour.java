package scannerClass;

import java.util.Scanner;

/* For you to do:
    Write a program that takes a user's name and prints it.

    **Example Output:**
    Hello, please enter your name
    Your name is Sumair
 */
public class TwentyFour {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Hello, please enter your name");
        String name = scan.next();
        System.out.println("Your name is "+name);
    }
}
