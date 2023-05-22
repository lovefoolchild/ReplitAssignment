package superKeyword;

import constructors.Car;

/* In parent class:
    Create a non argument constructor and write a logic to print "This is Parent constructor"
    Create a Child Class that will be subclass of the Parent class.
    Create a constructor without parameter and call parent class constructor explicitly
    In Main Class:
    Create and object of Child class and run the application.

    **Expected Output:**
    This is Parent constructor
 */
public class OneHundredFiftyThree {
    OneHundredFiftyThree(){
        System.out.println("This is Parent constructor");
    }
}

class ChildOneHundredFiftyThree extends OneHundredFiftyThree{
    ChildOneHundredFiftyThree(){
        super();
    }
}

class MainOneHundredFiftyThree {
    public static void main(String[] args) {
        ChildOneHundredFiftyThree child = new ChildOneHundredFiftyThree();
    }
}