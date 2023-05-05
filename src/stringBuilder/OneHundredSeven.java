package stringBuilder;

public class OneHundredSeven {
    public static void main(String[] args) {
        /* How would you reverse a String using StringBuffer Class
        Given String = "Hello Friends"

        **Expected Output:**
        sdneirF olleH
         */

        StringBuffer str=new StringBuffer("Hello Friends");
        System.out.println(str.reverse());
    }
}
