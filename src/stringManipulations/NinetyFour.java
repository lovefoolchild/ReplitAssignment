package stringManipulations;

public class NinetyFour {
    public static void main(String[] args) {
        /*
        **For you to do:**
        - Create a String given="I love Java classes at Syntax"
        - Retrieve 2 Strings using substring method from given String and print them

        **Expected Output:**
        classes at Syntax
        I love Java
         */

        String given="I love Java classes at Syntax";
        System.out.println(given.substring(12,given.length()));
        System.out.println(given.substring(0,11));
    }
}
