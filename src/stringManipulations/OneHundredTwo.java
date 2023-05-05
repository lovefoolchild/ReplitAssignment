package stringManipulations;

import java.util.Scanner;

public class OneHundredTwo {
    public static void main(String[] args) {
        /* For you to do:
        Inputs:
        String word;
        Write a for loop that will loop through every character of a word and print out each character,
        each on a separate line.

        Sample inputs/outputs:
        In: hello
            h
            e
            l
            l
            o
         */
        Scanner inp=new Scanner(System.in);
        System.out.println("In:");
        String word=inp.nextLine();

        for (int i=0; i<word.length(); i++){
            System.out.println(word.charAt(i));
        }
    }
}
