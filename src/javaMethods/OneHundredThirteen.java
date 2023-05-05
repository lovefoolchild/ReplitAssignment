package javaMethods;

/* For you to do:
    Step1: Create a method that will accept with 2 parameters of integer type
    Step2: Write the logic in that method in println statement to print hours and minutes
    Step3: Call the method

    **Expected Output:**
    11:30
 */
public class OneHundredThirteen {
    static void printTime(int hours, int minutes){
        System.out.println(hours+":"+minutes);
    }

    public static void main(String[] args) {
        int hours=11;
        int minutes=30;
        printTime(hours,minutes);
    }
}
