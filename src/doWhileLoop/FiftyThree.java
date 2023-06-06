package doWhileLoop;

/* For you to do:
    Using do while loop print even numbers from 20 to 1

    **Expected Output:**
    20
    18
    16
    14
    12
    10
    8
    6
    4
    2
 */
public class FiftyThree {
    public static void main(String[] args) {
        int i = 20;
        do {
            System.out.println(i);
            i-=2;
        } while (i>1);
    }
}
