package methodOverloading;

/* Create 3 overloaded methods to perform subtraction of  2, 3 and 4 numbers
    In main method execute all 3 methods to match the output:

    Expected Output:
    40 (should come from subtracting 4 numbers)
    30 (should come from subtracting 3 numbers)
    20 (should come from subtracting 2 numbers)
 */
public class OneHundredFiftyNine {
    public void subtract(int a, int b, int c, int d){
        int result=a-b-c-d;
        System.out.println(result+" (should come from subtracting 4 numbers)");
    }

    public void subtract(int a, int b, int c){
        int result=a-b-c;
        System.out.println(result+" (should come from subtracting 3 numbers)");
    }

    public void subtract(int a, int b){
        int result=a-b;
        System.out.println(result+" (should come from subtracting 2 numbers)");
    }
}

class Main {
    public static void main(String[] args) {
        OneHundredFiftyNine obj = new OneHundredFiftyNine();
        obj.subtract(100, 20, 20, 20);
        obj.subtract(100, 40, 30);
        obj.subtract(100, 80);
    }
}
