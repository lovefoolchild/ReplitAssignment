package list;

import java.util.LinkedList;

/*
        Create a Linked List that will store all prime numbers from 1 to 100
        Step 1. Create a method that will identify whether number is prime or not
        Step 2. Add all prime numbers into Linked List
        Print Linked List.

        **Expected Output:**
        [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]
 */
public class OneHundredNinetyTwo {
    public static void main(String[] args) {
        LinkedList<Integer> primeNum = new LinkedList<>();
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNum.add(i);
            }
        }
        System.out.println(primeNum);
        }
    }

