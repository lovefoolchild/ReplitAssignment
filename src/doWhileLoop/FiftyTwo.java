package doWhileLoop;

/* For you to do:
    Create a do while loop that prints out "Hello World!" 5 times.

    **Output:**
    Hello World!
    Hello World!
    Hello World!
    Hello World!
    Hello World!
 */
public class FiftyTwo {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("Hello World!");
            i++;
        } while (i<=5);
    }
}
