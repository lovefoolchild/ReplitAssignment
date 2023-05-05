package variablesInJava;

import com.sun.tools.javac.Main;

/*
    For you to do:

    Declare 3 instance variables to hold an integer, double and char values.
    Create 2 instances of the class and assign values to variables and the print them

    **Expected Output:**
    10
    10.23
    a
    100
    100.23
    s
 */
public class OneHundredTwentyOne {
    int number;
    double price;
    char letter;

    public static void main(String[] args){
        OneHundredTwentyOne class1 = new OneHundredTwentyOne();
        class1.number=10;
        class1.price=10.23;
        class1.letter='a';
        System.out.println(class1.number);
        System.out.println(class1.price);
        System.out.println(class1.letter);

        OneHundredTwentyOne class2 = new OneHundredTwentyOne();
        class2.number=100;
        class2.price=100.23;
        class2.letter='s';
        System.out.println(class2.number);
        System.out.println(class2.price);
        System.out.println(class2.letter);
    }
}
