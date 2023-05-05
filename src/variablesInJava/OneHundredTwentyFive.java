package variablesInJava;

import com.sun.tools.javac.Main;

/* For you to do:
    Declare a static variable **number** that will hold an integer value:
    Access **number** from the main method and assign value to it.
    Create an Object of the class, access **number** in a nonstatic way and assing value of 200.
    Print out **number** using class name and using instance

    **Expected Output:**
    200
    200
 */
public class OneHundredTwentyFive {
        static int number=200;

        public static void main(String[] args){
            int number = 200;

            OneHundredTwentyFive obj = new OneHundredTwentyFive();
            obj.number=200;

            System.out.println(OneHundredTwentyFive.number);
            System.out.println(number);
        }
    }

