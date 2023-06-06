package list;

import java.util.ArrayList;
import java.util.List;

/*
    Create an array list to type String, add these values below to your arraylist:
        hi
        yo
        sup
        yolo
        boop

        Remove 1, 3, 5 element from an array
        Print remained values one by one in one line

        **Expected Output:**
yo yolo
 */
public class OneHundredEightySeven {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("hi");
        words.add("yo");
        words.add("sup");
        words.add("yolo");
        words.add("boop");
        System.out.println(words);
        words.remove(0);
        words.remove(1);
        words.remove(2);
        System.out.println(words.get(0)+" "+words.get(1));
    }
}
