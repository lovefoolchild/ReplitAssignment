package superKeyword;
/* For you to do:
    Create class A, declare variable int i=10;
    Create class B  extends A, declare variable int i=20;
    Create a method to display value of variable i from both classes
    In Main Class, create an object of subclass and call method display

    **Expected Output:**
    20
    10
 */
public class AOneHundredFiftySix {
    int i = 10;
}

class BOneHundredFiftySix extends AOneHundredFiftySix {
    int i = 20;

    void print(){
        System.out.println(i);
        System.out.println(super.i);
    }
}

class MainOneHundredFiftySix {
    public static void main(String[] args) {
        BOneHundredFiftySix b = new BOneHundredFiftySix();
        b.print();
    }
}