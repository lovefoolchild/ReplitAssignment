package map;

import java.util.HashMap;

/*
    Create a Map in which you do not need to preserve the order of the entries
        Add below pair to it:
        "Street" = "Patrick ST"
        "Suite" = "265"
        "City" = "Vienna"
        "Zip" = "22180"
        "Country" = "United State"
    Find how many entries are inside the map.
    Remove all entries from the Map.
    Find the Map size again

        **Expected Output:**
        5
        0
 */
public class TwoHundredOne {
    public static void main(String[] args) {
        HashMap<String, String> entry = new HashMap<>();
        entry.put("Street", "Patrick ST");
        entry.put("Suite", "265");
        entry.put("City", "Vienna");
        entry.put("Zip", "22180");
        entry.put("Country", "United State");
        System.out.println(entry.size());
        entry.remove("Street", "Patrick ST");
        entry.remove("Suite", "265");
        entry.remove("City", "Vienna");
        entry.remove("Zip", "22180");
        entry.remove("Country", "United State");
        System.out.println(entry.size());
    }
}
