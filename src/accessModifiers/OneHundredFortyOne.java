package accessModifiers;

/* For you to do:
Create the maxValue method that will accept int array and return the maximum value in the array.

Method should be visible every class in any package!

Expected Output: 22
 */
public class OneHundredFortyOne {
    private static int maxValue(int[] arr){
        int biggestNumber=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>biggestNumber){
                biggestNumber=arr[i];
            }
        }
        return biggestNumber;
    }
    public static void main(String[] args) {
        int[] arr = {5,12,-3,7,3,22};
        System.out.println(maxValue(arr)); //should print 22
    }
}
