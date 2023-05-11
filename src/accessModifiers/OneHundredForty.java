package accessModifiers;

import java.util.Arrays;

/* For you to do:
Create the maxLength method that will accept String array of words and return the word with the largest length.
Method should be visible only within same package!

**Expected Output:**
this is long
 */
public class OneHundredForty {
    protected static String maxLength(String[] arr){
        int longestIndex=0;
        //String longestWord="";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length()>arr[longestIndex].length()){
                longestIndex=i;
            //if (arr[i].length()>longestWord.length()){
                //longestWord= arr[i];
            }
        }
        return arr[longestIndex];
        //return longestWord;
    }
    public static void main(String[] args) {
        String[] arr = {"hey","yolo","hi","this is long"};
        System.out.println(maxLength(arr));
        //should print "this is long"
    }
}
