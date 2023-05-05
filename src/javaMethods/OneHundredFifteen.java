package javaMethods;

/* Create a method that will accept a String as a parameter and return new String all in upper case
   Call method

    **Expected Output:**
    TEST
 */
public class OneHundredFifteen {
    static void upperCase(String word){
        System.out.println(word.toUpperCase());
    }

    public static void main(String[] args) {
        upperCase("test");
    }
}
