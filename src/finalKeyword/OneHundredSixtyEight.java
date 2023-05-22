package finalKeyword;

/* For you to do:
    Create an instance final method that will reverse a String and return that new String
    Call method from the main method

    **Expected Output:**
    olleh
 */
public class OneHundredSixtyEight {

    final String word="hello";

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb.reverse());
    }
}
