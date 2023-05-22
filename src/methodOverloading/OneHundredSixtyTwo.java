package methodOverloading;

/* Overload static method and then execute both overloaded methods.

    **Expected Output:**
    static method without parameter
    static method with int parameter
 */
public class OneHundredSixtyTwo {
    static void print(){
        System.out.println("static method without parameter");
    }

    static void print(int num){
        System.out.println("static method with int parameter");
    }

    public static void main(String[] args) {
        OneHundredSixtyTwo obj = new OneHundredSixtyTwo();
        obj.print();
        obj.print(10);
    }
}
