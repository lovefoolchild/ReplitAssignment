package doWhileLoop;

/* For you to do:
    Using do while loop print numbers from 10 to 20
    Must not include the number 20 in the output

    **Output:**
    10
    11
    12
    13
    14
    15
    16
    17
    18
    19
 */
public class FiftyOne {
    public static void main(String[] args) {
        int num = 10;
        do {
            System.out.println(num);
            num++;
        } while (num<20);
    }
}
