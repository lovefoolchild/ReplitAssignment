package forLoop;

/*  Create a for loop that prints out even numbers from 10 to 0
    Must not include the number 0 in the output

    **Output:**
    10
    8
    6
    4
    2
 */
public class FiftyFive {
    public static void main(String[] args) {
        for (int i = 10; i > 0 ; i-=2) {
            System.out.println(i);
        }
    }
}
