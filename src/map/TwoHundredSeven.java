package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
    Create Hash Map.
    Add the follow values
        map.put("ONE","AAA");
        map.put("TWO","BBB");
        map.put("THREE","CCC");
        map.put("FOUR","DDD");
        map.put("FIVE","EEE");
    Using EntrySet print the key and values pairs using iterator only
    replace with below key THREE--> ASEL and key FIVE-->SUMAIR
    Using EntrySet print the key and values pairs using iterator only

    OUTPUT:
        HashMap Before Replace :
        FIVE : EEE
        ONE : AAA
        FOUR : DDD
        TWO : BBB
        THREE : CCC
        ------------------
        HashMap After Replace :
        FIVE : SUMAIR
        ONE : AAA
        FOUR : DDD
        TWO : BBB
        THREE : ASEL
     */
public class TwoHundredSeven {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("ONE","AAA");
        map.put("TWO","BBB");
        map.put("THREE","CCC");
        map.put("FOUR","DDD");
        map.put("FIVE","EEE");

        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        System.out.println("HashMap Before Replace :");
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+" : "+value);
        }
        map.replace("THREE","CCC", "ASEL");
        map.replace("FIVE","EEE", "SUMAIR");
        System.out.println("------------------");
        System.out.println("HashMap After Replace :");
        Iterator<Map.Entry<String, String>> iterator1 = map.entrySet().iterator();
        while (iterator1.hasNext()){
            Map.Entry<String, String> entry = iterator1.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+" : "+value);
        }
    }
}
