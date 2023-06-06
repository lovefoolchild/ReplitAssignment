package logicalOperators;

import java.util.Scanner;

/* For you to do:
    Prompt user with a question: "Is it weekend?"
    If it is not a weekend --> subject="manual testing"
    Otherwise --> subject="Java"

    **Output**:
    Today you will be learning ____
 */
public class ThirtyEight {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Is it weekend?");
        boolean weekend=scanner.nextBoolean();
        String weekendSubject="Java";
        String weekdaySubject="manual testing";
        if (weekend==true) {
            System.out.println("Today you will be learning "+weekendSubject);
        } else {
            System.out.println("Today you will be learning "+weekdaySubject);
        }
    }
}
