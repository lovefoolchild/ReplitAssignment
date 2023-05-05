package stringManipulations;

import java.util.Scanner;

public class OneHundredFive {
    public static void main(String[] args) {
        /* For you to do:
        There is a code that takes input as a String.
        Write a program that will print out only vowels of that string

        Sample input/outputs:
        In: howdyho
        oo
         */
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();

        String word1=word.replaceAll("[^aeiou]","");
        System.out.println(word1);
    }
}
