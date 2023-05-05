package staticKeywords;

/* For you to do:**
Complete the reduce10 method by making it subtract 10 from every element of the double array number.
The method should be static and should return a new 2D array object
Print values from new array in the format below input
1 2 3 4
4 5 6 7
1 3 5 7

**Expected Output:**
-9 -8 -7 -6
-6 -5 -4 -3
-9 -7 -5 -3
 */
public class OneHundredThirtyTwo {
    static int[][] reduce10(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=arr[i][j]-10;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] arr={
                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {1, 3, 5, 7}
        };
        reduce10(arr);
        for (int[] a : arr){
            for (int number : a){
                System.out.print(number+" ");
            }
            System.out.println();
        }

    }
}
