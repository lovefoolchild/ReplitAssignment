package stringManipulations;

import java.util.Scanner;

public class NinetyFive {
    public static void main(String[] args) {
        /*
        **For you to do:**
        Using Scanner class input string value.
        Print out the following: "The first 3 letters of \_\_\_ is ___"

        For example, if the input is "banana", your output should be: "The first 3 letters of banana is ban".
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Type in a word.");
        String word=scanner.next();
        System.out.println("The first 3 letters of "+word+" is "+word.substring(0,3));
}
}
