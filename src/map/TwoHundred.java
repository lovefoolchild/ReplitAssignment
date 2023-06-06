package map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/*
    Create A Map that will preserve an order of entry objects:
    Add below pairs :
        "Street" = "Patrick ST"
        "Suite" = "265"
        "City" = "Vienna"
        "Zip" = "22180"
    "Country" = "United State"
    Print all values of from the map

        **Expected Output:**
        Patrick ST
        265
        Vienna
        22180
        United State
 */
public class TwoHundred {
    public static void main(String[] args) {
        LinkedHashMap<String, String> objects = new LinkedHashMap<>();
        objects.put("Street", "Patrick ST");
        objects.put("Suite", "265");
        objects.put("City", "Vienna");
        objects.put("Zip", "22180");
        objects.put("Country", "United State");

        Set<Map.Entry<String, String>> entrySet = objects.entrySet();
        for (var e : entrySet){
            System.out.println(e.getValue());
        }
    }
}
