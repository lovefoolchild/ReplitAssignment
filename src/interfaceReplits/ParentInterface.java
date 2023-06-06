package interfaceReplits;

/* Follow steps carefully:
    Step 1: Create Parent Interface as ParentInterface that will have undefined method parentMethod without parameters.
    Step 2: Create an Interface as ChildInterface that will be a child interface of Parent Interface and will have
            a method childMethod without parameters.
    Step 3: Inherit the Main class to Child Interface.
    Step 4: Execute both methods

    **Expected Output:**
    Parent Method-welcome to Syntax
    Child Method-hello Syntax
 */
public interface ParentInterface {
    void parentMethod();
}

interface ChildInterface extends ParentInterface {
    void childMethod();
}

class Main176 implements ChildInterface {
    @Override
    public void parentMethod(){
        System.out.println("Parent Method-welcome to Syntax");
    }
    @Override
    public void childMethod(){
        System.out.println("Child Method-hello Syntax");
    }

    public static void main(String[] args) {
        Main176 main176 = new Main176();
        main176.parentMethod();
        main176.childMethod();
    }
}