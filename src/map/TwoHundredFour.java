package map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/*
    Create a Map that will preserve an order of entry objects
    Add below pair to it:
        "Street" = "Patrick ST"
        "Suite" = "265"
        "City" = "Vienna"
        "Zip" = "22180"
    "Country" = "United State"
    Print all values using iterator

    **Expected output:**
    Patrick ST
    265
    Vienna
    22180
    United State
 */
public class TwoHundredFour {
    public static void main(String[] args) {
        LinkedHashMap<String, String> entry = new LinkedHashMap<>();
        entry.put("Street", "Patrick ST");
        entry.put("Suite", "265");
        entry.put("City", "Vienna");
        entry.put("Zip", "22180");
        entry.put("Country", "United State");

        Iterator<Map.Entry<String, String>> iterator = entry.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> entry1 = iterator.next();
            String value = entry1.getValue();
            System.out.println(value);
        }
    }
}
