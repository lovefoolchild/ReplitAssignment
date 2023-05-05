package variablesInJava;

/* For you to do:
    Declare the **instance** variables to hold:
    - integer values
    - String values
    - double values
    - boolean values
    - float values

    Access instance variables and then print them all without assigning any values to them.
    Print variables one by one the same sequence that you declare them.

    **Expected Output:**
    0
    null
    0.0
    false
    0.0
 */
public class OneHundredTwentyThree {
    int num;
    String word;
    double mark;
    boolean isTrue;
    float value;

    public static void main(String[] args) {
        OneHundredTwentyThree obj = new OneHundredTwentyThree();
        System.out.println(obj.num);
        System.out.println(obj.word);
        System.out.println(obj.mark);
        System.out.println(obj.isTrue);
        System.out.println(obj.value);
    }
}
