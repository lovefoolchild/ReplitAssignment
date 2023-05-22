package superKeyword;

/* Create Class call Parent.
        Create a class String **variable** call city.
        Create Parent constructor take the String parameter city, include the logic to assign the value of parameter to class variable.
        Create method with below specification.
        Access modifier public.
        Return type void
        Name display
        Write to logic print below sentence.
        "City name " + the value of class variable.
    Create Child Class.
        Inherit to Parent class.
        Create Child constructor with one String parameter called city.
        Call super constructor and pass the parameter.
    In Main Class.
        Create and object of Child class. pass city name as "Fairfax" and call the display method.

    Output:
    City name Fairfax
 */
public class ParentOneHundredFiftyEight {
    String cityName;
    ParentOneHundredFiftyEight(String cityName){
        this.cityName=cityName;
    }
    public void display(){
        System.out.println("City name "+cityName);
    }
}

class ChildOneHundredFiftyEight extends ParentOneHundredFiftyEight {
    ChildOneHundredFiftyEight(String cityName){
        super(cityName);
    }
}

class MainOneHundredFiftyEight {
    public static void main(String[] args) {
        ChildOneHundredFiftyEight obj = new ChildOneHundredFiftyEight("Fairfax");
        obj.display();
    }
}