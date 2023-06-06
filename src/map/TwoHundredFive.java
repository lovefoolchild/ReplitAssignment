package map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
    Create a HashMap of String.
    Add below pair to it:
        "Street" = "Patrick ST"
        "Suite" = "265"
        "City" = "Vienna"
        "Zip" = "22180"
        "Country" = "United State"
    Print all the values in upper case using entrySet

    **Expected Output:**
    265
    22180
    PATRICK ST
    UNITED STATE
    VIENNA
 */
public class TwoHundredFive {
    public static void main(String[] args) {
        HashMap <String, String> entry = new HashMap<>();
        entry.put("Street", "Patrick ST");
        entry.put("Suite", "265");
        entry.put("City", "Vienna");
        entry.put("Zip", "22180");
        entry.put("Country", "United State");

        Set<Map.Entry<String, String>> entrySet = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (var e : entry.entrySet()){
            System.out.println(e.getValue().toUpperCase());
        }
    }
}
