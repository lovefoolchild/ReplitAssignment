package methodOverloading;

/* Create a method hello() in parent class that will print "method in Parent class" then override
that method is 3 Subclasses implementing login to print "method in Child1/Child2/Child3 class"

In Main Class create 3 object of the child classes and store in into an array and call method hello():

**Expected Output:**
method in Child1 class
method in Child2 class
method in Child3 class
 */
public class ParentOneHundredSixtyFour {
    void hello(){
        System.out.println("method in Parent class");
    }
}

class Child1OneHundredSixtyFour extends ParentOneHundredSixtyFour{
    void hello(){
        System.out.println("method in Child1 class");
    }
}

class Child2OneHundredSixtyFour extends ParentOneHundredSixtyFour{
    void hello(){
        System.out.println("method in Child2 class");
    }
}

class Child3OneHundredSixtyFour extends ParentOneHundredSixtyFour{
    void hello(){
        System.out.println("method in Child3 class");
    }
}

class MainOneHundredSixtyFour {
    public static void main(String[] args) {
        Child1OneHundredSixtyFour child1 = new Child1OneHundredSixtyFour();
        child1.hello();
        Child2OneHundredSixtyFour child2 = new Child2OneHundredSixtyFour();
        child2.hello();
        Child3OneHundredSixtyFour child3 = new Child3OneHundredSixtyFour();
        child3.hello();
    }
}