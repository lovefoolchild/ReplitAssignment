package variablesInJava;

/* For you to do:
    Declare 3 instance variables to hold:
    year, school name and batch #
    Access variables from the main method and assign specific values to them
    Print values of your variables in the following format:

    **Expected Output:**
    I am a student of batch 9 studying at Syntax in the year of 2021
 */
public class OneHundredTwenty {
    int year;
    String schoolName;
    int batchNo;

    public static void main(String[] args){
        int year=2021;
        String schoolName="Syntax";
        int batchNo=9;
        System.out.println("I am a student of batch "+batchNo+" studying at "+schoolName+" in the year of "+year);
    }
}
