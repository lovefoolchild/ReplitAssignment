package stringBuilder;

public class OneHundredSix {
    public static void main(String[] args) {
        /* For you to do

        Instantiate and StringBuffer class
        Append Value "Hello" to it
        Append value "World" to it.
        Print in UPPERCASE.

        **Expected Output:**
        HELLO WORLD */

        StringBuffer str=new StringBuffer("Hello");
        StringBuffer str1=new StringBuffer("World");
        System.out.println(str.toString().toUpperCase()+" "+str1.toString().toUpperCase());
    }
}
