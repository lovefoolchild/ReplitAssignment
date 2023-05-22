package methodOverloading;

/* Parent class create 4 methods with different level of access modifiers. In each method print
    "I am parent public/protected/default/private method".
    Override methods in child class
    In Main Class create object of the child class and see which methods are available

    **Expected Output:**
    I am a child public method
    I am a child protected method
    I am a child default method
 */
public class ParentOneHundredSixtyFive {
    public void print(){
        System.out.println("I am parent public method");
    }

    protected void print(char letter){
        System.out.println("I am parent protected method");
    }

    void print(int number){
        System.out.println("I am parent default method");
    }

    private void print(String word){
        System.out.println("I am parent private method");
    }
}

class ChildOneHundredSixtyFive extends ParentOneHundredSixtyFive {

    public void print(){
        System.out.println("I am a child public method");
    }

    protected void print(char letter){
        System.out.println("I am a child protected method");
    }

    void print(int number){
        System.out.println("I am a child default method");
    }

    private void print(String word){
        System.out.println("I am a child private method");
    }
}

class MainOneHundredSixtyFive {
    public static void main(String[] args) {
        ChildOneHundredSixtyFive child = new ChildOneHundredSixtyFive();
        child.print();
        child.print('A');
        child.print(1);
    }

}