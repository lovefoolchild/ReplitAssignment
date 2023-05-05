package twoDArrays;

public class EightyTwo {
    public static void main(String[] args) {
        // Write a program that will print the sum of all elements in 2D array.
        int[][] a = {
                {-5,-2,-3,7},
                {1,-5,-2, 2},
                {1,-2, 3,-4}
        };
        int sum=0;
        for (int[] elements : a){
            for (int number : elements){
                sum+=number;
            }
        }
        System.out.println(sum);
    }
}
