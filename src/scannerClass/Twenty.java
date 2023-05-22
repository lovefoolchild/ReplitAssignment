package scannerClass;

import java.util.Scanner;

/* For you to do:**
    Write  a program that takes user's first name and last name and prints in console
    Instruct the user to enter first name: "Please Enter First Name"
    Capture the first name
    Instruct the user to enter last name:"Please Enter Last Name"
    Capture last name
    Print first name and last name

    **Final Output:**
    Example:
    Please Enter First Name
    Please Enter Last Name
    Cindy Crawford
 */
public class Twenty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter First Name");
        String firstName = scanner.next();
        System.out.println("Please Enter Last Name");
        String lastName = scanner.next();
        System.out.println(firstName+" "+lastName);
    }
}
