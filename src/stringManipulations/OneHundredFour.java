package stringManipulations;

import java.util.Arrays;
import java.util.Scanner;

public class OneHundredFour {
    public static void main(String[] args) {
        /* For you to do:
        Create an array of names that will hold 5 String elements.
        Names must be taking from a user.
        Print out the first three characters of each element of the array, one per line.
        Note: every array element must be at least 3 characters long.

        Input Example:
        John
        Jane
        Jimmy
        Mike
        Emily

        Expected Output:
        **Joh**
        **Jan**
        **Jim**
        **Mik**
        **Emi** */
        String[] names=new String[5];
        Scanner scanner=new Scanner(System.in);
        System.out.println("Type in names of your five favorite persons, must be minimum of 3 characters long.");
        String arr1="";
        for (int i=0; i<names.length; i++){
            do {
                System.out.println("Enter name "+(i+1)+": ");
                arr1=scanner.nextLine();
            } while (arr1.length()<3);
                names[i]=arr1;
        }
        for (int i=0; i<names.length; i++){
            System.out.println(names[i].substring(0,3));
        }
    }
}
