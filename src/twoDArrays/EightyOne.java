package twoDArrays;

public class EightyOne {
    public static void main(String[] args) {
        /* Write a program that prints the highest value in the array.
        Input [5,4,8]; expected output = 8 */

        int[] x = {5, 4, 8};
        int highestValue = x[0];
        for (int i : x) {
            if (highestValue < i) {
                highestValue = i;
            }
        }
        System.out.println(highestValue);
    }
}
