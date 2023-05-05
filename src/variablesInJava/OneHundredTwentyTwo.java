package variablesInJava;

import com.sun.tools.javac.Main;

/* For you to do:
    Declare 3 instance variables to hold:
    - name of the country
    - capital
    - population size

    Create a method to display values of instance variables
    Create 2 Object, assign values to instance variables, execute method display;

    **Expected Output:**
    The capital of USA is Washington DC and population is 330000000
    The capital of Kazakhstan is Astana and population is 18500000
 */
public class OneHundredTwentyTwo {
    String countryName;
    String capital;
    long population;

    public static void main(String[] args){
        OneHundredTwentyTwo country = new OneHundredTwentyTwo();
        country.countryName="USA";
        country.capital="Washington DC";
        country.population=330000000L;
        System.out.println("The capital of "+country.countryName+" is "+country.capital+" and population is "+country.population);

        OneHundredTwentyTwo country1 = new OneHundredTwentyTwo();
        country1.countryName="Kazakhstan";
        country1.capital="Astana";
        country1.population=18500000L;
        System.out.println("The capital of "+country1.countryName+" is "+country1.capital+" and population is "+country1.population);
    }
}
