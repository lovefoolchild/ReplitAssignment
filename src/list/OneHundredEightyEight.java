package list;

import java.util.ArrayList;
import java.util.Scanner;

/*
    Using Scanner class add 5 elements into ArrayList and then print all elements from that ArrayList all in 1 line
        Numbers in:
        4
        62
        8
        5
        4

    **Expected Output:**
        4 62 8 5 4
 */
public class OneHundredEightyEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList<>();
        System.out.println("Enter this number at the console: 4");
        number.add(scanner.nextInt());
        System.out.println("Enter this number at the console: 62");
        number.add(scanner.nextInt());
        System.out.println("Enter this number at the console: 8");
        number.add(scanner.nextInt());
        System.out.println("Enter this number at the console: 5");
        number.add(scanner.nextInt());
        System.out.println("Enter this number at the console: 4");
        number.add(scanner.nextInt());

        for (int i = 0; i < number.size(); i++) {
            System.out.print(number.get(i)+" ");
        }
    }
}
