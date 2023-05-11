package accessModifiers;

/* For you to do:
In AnotherClass declare a private, default, protected, public methods and have them each return the name of what
access modifier they are using.

All methods should be accessible by class name
Call methods of Another class inside Main class

**Expected Output:**
default
protected
public

 */
public class OneHundredThirtyEight {
    private void printPrivate(){
        System.out.println("private");
    }
    void printDefault(){
        System.out.println("default");
    }
    protected void printProtected(){
        System.out.println("protected");
    }
    public void printPublic(){
        System.out.println("public");
    }

    public static void main(String[] args) {
        OneHundredThirtyEight ac = new OneHundredThirtyEight();
        ac.printDefault();
        ac.printProtected();
        ac.printPublic();
        ac.printPrivate();
    }
}
