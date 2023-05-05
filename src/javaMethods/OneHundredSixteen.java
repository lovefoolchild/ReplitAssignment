package javaMethods;

/* Create a method that will accept 2 numbers as parameters and return true if both numbers are even
   otherwise returned false. (Return false if one or both given numbers are not even)

    Examples:
    - bothEven(4,6) ==> true
    - bothEven(3,4) ==> false
    - bothEven(-1,1) ==> false

    **Expected Output:**

    false
 */
public class OneHundredSixteen {
    static void bothEven(int num1, int num2){
        boolean evenNumbers=true;
        if (num1%2==0 && num2%2==0){
            System.out.println(evenNumbers);
        } else {
            System.out.println(!evenNumbers);
        }
    }

    public static void main(String[] args) {
        bothEven(4,9);
    }
}
