package forLoop;

import java.util.Scanner;

/*  Given the following inputs:
int x;
Write a for loop that will print out a series of numbers starting at one less than x and ending at 0.

Sample input/outputs:
In: 7
6 5 4 3 2 1 0
In: 12
11 10 9 8 7 6 5 4 3 2 1 0
In: 20
19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 0
 */
public class SixtyFive {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int userInput= scanner.nextInt();
        for (int x=userInput-1; x>=0; x--){
            System.out.print(x+" ");
        }
    }
}
