package twoDArrays;

public class EightyThree {
    public static void main(String[] args) {
        /* Write a program that calculates the sum of elements from each row in a 2D array and adds them into
        array of integers */
        int[][] a = {
                {1,1,2}, //sum = 4
                {3,1,2}, //sum = 6
                {3,5,3}, //sum = 11
                {0,1,2}  //sum = 3
        };
        int rowSum=0;
        int arrayOfIntegers=0;
        for (int[] row : a){
            rowSum=0;
            for (int num : row){
                rowSum+=num;
            }
            System.out.println(rowSum);
        }
    }
}
