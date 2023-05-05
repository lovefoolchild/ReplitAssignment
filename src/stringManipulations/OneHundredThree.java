package stringManipulations;

import java.util.Scanner;

public class OneHundredThree {
    public static void main(String[] args) {
        /* Given the following inputs:
        String s;
        Write a for loop that will print out each letter of the string s,
        separated by spaces, on the same line.

        Sample input/outputs:
        In: hello
            h e l l o

        In: covert
            c o v e r t
         */
        Scanner inp=new Scanner(System.in);
        System.out.println("In:");
        String s = inp.nextLine();

        for (int i=0; i<s.length(); i++){
            System.out.print(s.charAt(i)+" ");
        }
    }
}
