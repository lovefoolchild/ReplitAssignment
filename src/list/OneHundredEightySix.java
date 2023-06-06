package list;

import java.util.ArrayList;
import java.util.List;

/*
    Create an Arraylist of type Integer, add below elements to it.
        111
        222
        333
        444
        555
        666
        Print the ArrayList.
        Remove all the elements.
        Print the Arraylist.

        **Expected Output:**
        [111, 222, 333, 444, 555, 666]
        []
 */
public class OneHundredEightySix {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(111);
        number.add(222);
        number.add(333);
        number.add(444);
        number.add(555);
        number.add(666);
        System.out.println(number);
        number.removeAll(number);
        System.out.println(number);
    }
}
