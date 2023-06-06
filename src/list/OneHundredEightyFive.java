package list;

import java.util.ArrayList;

/*
    Create an arrayList of type Integer, add below values.
        111
        111
        111
        999
        999
        999
        Print all the values of List 1 by 1:

    **Expected Output:**
        111
        111
        111
        999
        999
        999
 */
public class OneHundredEightyFive {
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<>();
        values.add(111);
        values.add(111);
        values.add(111);
        values.add(999);
        values.add(999);
        values.add(999);

        for (Integer number : values) {
            System.out.println(number);
        }
    }
}
