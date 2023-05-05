package staticKeywords;

/* For you to do:
    Declare two static variables to hold
        - country name
        - continent
    Create a method to display the value of static variables in the following format:
    ____ located on \_\_\_\_ continent
    In the main method assign values to a static variable and execute method display

    **Expected Output:**
    Morocco located on Africa continent
 */
public class OneHundredTwentyNine {
    static String countryName;
    static String continent;

    public static void main(String[] args) {
        countryName = "Morocco";
        continent = "Africa";
        System.out.println(countryName+" located on "+continent+" continent");
    }
}
