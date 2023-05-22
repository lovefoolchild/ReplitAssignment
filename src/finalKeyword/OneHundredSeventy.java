package finalKeyword;

/* For you to do:
    Overload 2 final instance methods:
    Call them in main method

    **Expected Output:**
    Final method with boolean parameter
    Final method with String parameter
 */
public class OneHundredSeventy {

    final void print(boolean message){
        System.out.println("Final method with boolean parameter");
    }

    final void print(String message){
        System.out.println("Final method with String parameter");
    }

    public static void main(String[] args) {
        OneHundredSeventy main = new OneHundredSeventy();
        main.print(true);
        main.print("Lovely");
    }
}
