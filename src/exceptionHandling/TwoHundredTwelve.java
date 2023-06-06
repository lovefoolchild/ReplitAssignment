package exceptionHandling;

/*
Create a method that will not be handling exception and throwing it at caller.

In main method call method and handle the exception.

**Expected Output:**
java.io.FileNotFoundException:  (No such file or directory)
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TwoHundredTwelve {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            print();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

    static void print() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("Love");
    }
}
