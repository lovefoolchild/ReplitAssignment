package logicalOperators;

import java.util.Scanner;

/* For you to do:
    Create a program that prompt user with question:  "Do you need a loan?"(Use a boolean)
    If the result is true then prompt user with question: "What is your credit score?". Otherwise eligibility is "Unknown"
    Based on the score define users eligibility:
    - if score is below  600 --> eligibility = "Not eligible"
    - if score is between 600 and 700 inclusive -->  eligibility = "Maybe eligible"
    - if score is between 701 and 800 inclusive -->  eligibility = "Eligible"
    - if score is higher than any other previous values --> eligibility = "Definitely eligible" .

    **Output:**
    The eligibility is ____
 */
public class ThirtyFive {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Do you need a loan?");
        boolean loan=scanner.nextBoolean();
        if (loan==true){
            System.out.println("What is your credit score?");
            int score= scanner.nextInt();
            if (score<600) {
                System.out.println("The eligibility is Not eligible");
            } else if (score>=600 && score<=700) {
                System.out.println("The eligibility is Maybe eligible");
            } else if (score>=701 && score<=800) {
                System.out.println("The eligibility is Eligible");
            } else if (score>800) {
                System.out.println("The eligibility is Definitely eligible");
            }
        } else {
            System.out.println("Unknown");
        }
    }
}
