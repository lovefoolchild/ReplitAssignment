package exceptionHandling;

import java.util.Scanner;

/*
Create a method that will do temperature check. Anytime user passes temperature that is below 32 method should throw an Exception saying "It is freezing"

In Main method call the method and handle an Exception

**Expected Output:**
java.lang.RuntimeException: It is freezing
 */
public class TwoHundredThirteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Type in the your current temperature.");
            int temperature = scanner.nextInt();

            if (temperature < 32) {
                throw new RuntimeException("It is freezing");
            }
        } catch (RuntimeException e) {
            System.out.println(e);
        }
    }

    static void checkTemp() throws RuntimeException{

    }
}
