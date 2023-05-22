package superKeyword;
/* Create three classes (A, B, C)
    Write two constructors:
    * Have a default constructor that prints out the following
    For A:  "I"
    For B: "am"
    For C: "a tester"
    Make C extend B
    and B extend A
    From your Main class create an object of the C class.

    **Expected Output:**
    I
    am
    a tester
 */
public class A {
    A(){
        System.out.println("I");
    }
}

class B extends A {
    B(){
        super();
        System.out.println("am");
    }
}

class C extends B {
    C(){
        super();
        System.out.println("a tester");
    }
}

class ABCMain {
    public static void main(String[] args) {
        C c = new C();
    }
}