package list;

import java.util.ArrayList;

/*
    Create an array list that will hold String Objects
    Find out whether array list is empty or not.
    Add String value "Syntax" to it
    Find out whether array list is empty or not.

    **Expected Output:**
    true
    false
 */
public class OneHundredEightyThree {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println(arrayList.isEmpty());
        arrayList.add("Syntax");
        System.out.println(arrayList.isEmpty());
    }
}
