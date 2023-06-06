package forLoop;

/* or you to do:**

Using for loop Print 1 to 10 Numbers except 5 and 6

**Expected Output:**
1
2
3
4
7
8
9
10
 */
public class SixtyTwo {
    public static void main(String[] args) {
        for (int number=1; number<=10; number++){
            if (number!=5 && number!=6){
                System.out.println(number);
            }
        }
    }
}
