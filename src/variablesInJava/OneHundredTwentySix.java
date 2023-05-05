package variablesInJava;

import com.sun.tools.javac.Main;

/* For you to do:

    Create a variable that will hold the count of all instances of the Main class
    Create 3 Object of the class and print value of the count variable;

    **Expected Output:**
    3
 */
public class OneHundredTwentySix {
    int count;

    public static void main(String[] args){
        OneHundredTwentySix obj = new OneHundredTwentySix();
        obj.count=1;

        OneHundredTwentySix obj1 = new OneHundredTwentySix();
        obj1.count=1;

        OneHundredTwentySix obj2 = new OneHundredTwentySix();
        obj2.count=1;

        System.out.println(obj.count+obj1.count+obj2.count);
    }
}
