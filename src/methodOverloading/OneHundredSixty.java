package methodOverloading;

/* For you to do:
    Overload instance method display by having different types of parameters
    Inside each method write the logic to print value of the parameter
    Call all methods inside your main method

    **Expected Output:**
    100
    Syntax Technologies
    100.09
 */
public class OneHundredSixty {
    public void display(int num){
        System.out.println(num);
    }

    public void display(String name){
        System.out.println(name);
    }

    public void display(double num){
        System.out.println(num);
    }
}

class MainOneHundredSixty {
    public static void main(String[] args) {
        OneHundredSixty obj = new OneHundredSixty();
        obj.display(100);
        obj.display("Syntax Technologies");
        obj.display(100.09);
    }
}