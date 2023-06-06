package list;

import java.util.LinkedList;
import java.util.List;

/*
    Create Linked List that will store first 10 numbers of fibonacci series
    Print number from Linked List 1 by 1 all in 1 line

    **Expected Output:**
    0 1 1 2 3 5 8 13 21 34
 */
public class OneHundredNinety {
    public static void main(String[] args) {
        LinkedList<Integer> number = new LinkedList<>();
        var a=0;
        var b=1;
        var c=0;
        number.add(a);
        number.add(b);

        System.out.print(number.get(0)+" ");
        System.out.print(number.get(1)+" ");
        for (int i = 0; i <8; i++) {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
