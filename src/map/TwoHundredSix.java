package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    Create a Hash Map of String pairs.
    Add the follow values
        map.put("ONE","AAA");
        map.put("TWO","BBB");
        map.put("THREE","CCC");
        map.put("FOUR","DDD");
        map.put("FIVE","EEE");
    Using entry set print key and values pairs using loop
    Remove below from Map
        "ONE"
        "FOUR"
    Using entry set print key and values pairs using loop

    **Expected Output:**
    HashMap Before Remove :
    FIVE : EEE
    ONE : AAA
    FOUR : DDD
    TWO : BBB
    THREE : CCC
    ------------------
    HashMap After Remove :
    FIVE : EEE
    TWO : BBB
    THREE : CCC
 */
public class TwoHundredSix {
    public static void main(String[] args) {
        Map<String, String>  map = new HashMap<>();
        map.put("ONE","AAA");
        map.put("TWO","BBB");
        map.put("THREE","CCC");
        map.put("FOUR","DDD");
        map.put("FIVE","EEE");

        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        System.out.println("HashMap Before Remove :");
        for (var entry : entrySet) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        System.out.println("------------------");
        System.out.println("HashMap After Remove :");
        map.remove("ONE", "AAA");
        map.remove("FOUR", "DDD");

        for (var entry1 : entrySet) {
            System.out.println(entry1.getKey()+" : "+entry1.getValue());
        }
    }
}
