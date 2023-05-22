package finalKeyword;

/* For you to do:
    Create final method avgElements that will average all the elements in an integer array
    (passed to the method as a parameter) and return the average.

    **Expected Output:**
    4.8
 */
public class OneHundredSixtyNine {

    final double avgElements(int[] a){
        int sum=0;
        for (int element : a) {
            sum+=element;
        }
        return (double) sum/a.length;
    }
}

class MainOneHundredSixtyNine {
    public static void main(String[] args) {
        OneHundredSixtyNine main = new OneHundredSixtyNine();
        int[] a = {2,7,3,8,4};
        System.out.println(main.avgElements(a));
    }
}