package forLoop;

/*      Write a program that prints the countdown from 10 up to 1 and then says "Happy New Year!".

        **Output:**
        10
        9
        8
        7
        6
        5
        4
        3
        2
        1
        Happy New Year!
 */
public class Sixty {
    public static void main(String[] args) {
        for (int countdown = 10; countdown > 0; countdown--) {
            System.out.println(countdown);
        }
        System.out.println("Happy New Year!");
    }
}
