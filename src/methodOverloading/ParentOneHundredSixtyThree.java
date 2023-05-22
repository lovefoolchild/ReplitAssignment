package methodOverloading;

/* In Parent Class create a method with name method() that will print  "Parent method"
    Override method() in Child class that will print "Child method"
    In Main Class create objects of child and parent class and call its method.

    **Expected Output:**
    Parent method
    Child method
 */
public class ParentOneHundredSixtyThree {
    void method(){
        System.out.println("Parent method");
    }
}

class ChildOneHundredSixtyThree {
    void method(){
        System.out.println("Child method");
    }
}

class MainOneHundredSixtyThree {
    public static void main(String[] args) {
        ParentOneHundredSixtyThree parent = new ParentOneHundredSixtyThree();
        parent.method();
        ChildOneHundredSixtyThree child = new ChildOneHundredSixtyThree();
        child.method();
    }
}