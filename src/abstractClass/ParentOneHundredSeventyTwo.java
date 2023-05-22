package abstractClass;

/* Abstraction:
    Create a Parent Class in which you will have 1 implemented method m2 and 1 unimplemented method m1
    Make Main class to be a derived class from Parent.
    In main method execute both methods

    **Expected Output:**
    Child class providing implementation
    Parent class providing implementation
 */
public abstract class ParentOneHundredSeventyTwo {

    void m2(){
        System.out.println("Parent class providing implementation");
    }

    abstract void m1();
}

class MainOneHundredSeventyTwo extends ParentOneHundredSeventyTwo{

    @Override
    void m2() {
        super.m2();
    }

    @Override
    void m1() {
        System.out.println("Child class providing implementation");
    }

    public static void main(String[] args) {
        MainOneHundredSeventyTwo main = new MainOneHundredSeventyTwo();
        main.m1();
        main.m2();
    }
}