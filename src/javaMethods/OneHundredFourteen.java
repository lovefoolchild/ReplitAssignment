package javaMethods;

/* For you to do :**
    Step1: Create three methods that will accept 2 in parameters on integer type
    Step2: Write the logic in methods to perform actions below:
           The first method for multiplication
           The second method for addition
           The third method for subtraction
    Step3: Execute all methods
           1. For the addition method add two numbers to make 30
           2. For multiplication multiply two numbers to make 30
           3. For Subtraction subtract two numbers to equal 20

    **Expected Output:**
    Addition 30
    Multiplication 30
    Subtraction 20

 */
public class OneHundredFourteen {

    static void multiplication(int num1, int num2){
        int result=num1*num2;
        System.out.println("Multiplication "+result);
    }

    static void addition(int num1, int num2){
        int result=num1+num2;
        System.out.println("Addition "+result);
    }
    static void subtraction(int num1, int num2){
        int result=num1-num2;
        System.out.println("Subtraction "+result);
    }

    public static void main(String[] args) {
        addition(10,20);
        multiplication(2,15);
        subtraction(40,20);
    }
}
