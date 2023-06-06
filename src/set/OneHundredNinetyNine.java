package set;

import java.util.Iterator;
import java.util.LinkedHashSet;

/*
Create a Set collection in which you want to preserve an order of inserted String Objects.
Add the below values:
    - null
    - Sohil
    - Diego
    - Alijon
    - Asel
    - Sumair

Print values 1 by 1 using loop and Iterator
    null
    Sohil
    Diego
    Alijon
    Asel
    Sumair
    null
    Sohil
    Diego
    Alijon
    Asel
    Sumair
 */
public class OneHundredNinetyNine {
    public static void main(String[] args) {
        LinkedHashSet<String> values = new LinkedHashSet<>();
        values.add("null");
        values.add("Sohil");
        values.add("Diego");
        values.add("Alijon");
        values.add("Asel");
        values.add("Sumair");

        for (String val : values){
            System.out.println(val);
        }

        Iterator<String> iterator = values.iterator();
        while (iterator.hasNext()){
            String value = iterator.next();
            System.out.println(value);
        }
    }
}
