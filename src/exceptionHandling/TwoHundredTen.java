package exceptionHandling;

/*
Complete the code, handle possible exception

**Expected Output:**

/ by zero
 */
public class TwoHundredTen {
    public static void main(String[] args) {
        int a=10, b=0;
        int result;

        try {
            result = a/b;
        } catch (Exception e) {
            System.out.println("/ by zero");
        }
    }
}
