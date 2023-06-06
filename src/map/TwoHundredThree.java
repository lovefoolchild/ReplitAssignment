package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


/*
    Create HashMap
    Add values as below:
        map.put("mango", 10);
        map.put("apple", 30);
        map.put("orange", 20);
        map.put("mango", 40);
        map.put("mango", 40);
    Using iterator retrieve all keys and values if the format below:

    **Expected Output:**
    Key = orange and value = 20
    Key = apple and value = 30
    Key = mango and value = 40
 */
public class TwoHundredThree {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("mango", 10);
        map.put("apple", 30);
        map.put("orange", 20);
        map.put("mango", 40);
        map.put("mango", 40);

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key = "+key+" and value = "+value);
        }
    }
}
