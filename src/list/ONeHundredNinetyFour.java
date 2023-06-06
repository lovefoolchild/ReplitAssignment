package list;

import java.util.ArrayList;
import java.util.LinkedList;

/* For you to do:
        Create a method that takes a list as a parameter removes an element if it starts with letter A from given List
        and return new List then in the main method print that list.

         **Expected Output:**
        [USA, Kazakhstan, Pakistan, Russia]
 */
public class ONeHundredNinetyFour {
    public static void main(String[] args) {
        ArrayList<String> countries =new ArrayList<>();
        countries.add("Armenia");
        countries.add("USA");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");
        countries.add("Azerbaijan");
        countries.removeIf(country->country.startsWith("A"));
        System.out.println(countries);
    }
}
