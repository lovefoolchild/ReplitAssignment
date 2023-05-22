package abstractClass;

/* Abstraction:
    Create a Parent Class that will have two overloaded abstract methods m1
    Make Main class as concrete subclass to Parent Class
    In main method call the methods.

    **Expected Output:**
    m1 without parameters
    m1 method with parameter
 */
public abstract class ParentOneHundredSeventyOne {

    abstract void m1();
    abstract void m1(int number);
}

class MainOneHundredSeventyOne extends ParentOneHundredSeventyOne {

    @Override
    void m1() {
        System.out.println("m1 without parameters");
    }

    @Override
    void m1(int number) {
        System.out.println("m1 method with parameter");
    }

    public static void main(String[] args) {
        MainOneHundredSeventyOne main = new MainOneHundredSeventyOne();
        main.m1();
        main.m1(15);
    }
}