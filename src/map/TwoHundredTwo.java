package map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
Create Map in which we want to store keys in Ascending order
    Add the below values:
    1 item = apple
    2 item = banana
    3 item = pear
    4 item = tomato
    5 item = mango
    6 item = kiwi
Extract all keys and its values and print them in the format below:

**Expected Output:**
Key is 1 item and values is apple
Key is 2 item and values is banana
Key is 3 item and values is pear
Key is 4 item and values is tomato
Key is 5 item and values is mango
Key is 6 item and values is kiwi
 */
public class TwoHundredTwo {
    public static void main(String[] args) {
        TreeMap<String, String> fruityloops = new TreeMap<>();
        fruityloops.put("1 item", "apple");
        fruityloops.put("2 item", "banana");
        fruityloops.put("3 item", "pear");
        fruityloops.put("4 item", "tomato");
        fruityloops.put("5 item", "mango");
        fruityloops.put("6 item", "kiwi");

        Set<Map.Entry<String, String>> entrySet = fruityloops.entrySet();
        for (var fruit : fruityloops.entrySet()){
            System.out.println("Key is "+fruit.getKey()+" and values is "+fruit.getValue());
        }
    }
}
