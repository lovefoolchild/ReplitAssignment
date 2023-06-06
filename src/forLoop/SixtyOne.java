package forLoop;

/*
For you to do:
Write a program that uses for loop to print multiplication of  number 3 from 1 to 10

**Expected Output:**
3*1=3
3*2=6
3*3=9
3*4=12
3*5=15
3*6=18
3*7=21
3*8=24
3*9=27
3*10=30
 */
public class SixtyOne {
    public static void main(String[] args) {
        for (int multiplyBy=1; multiplyBy<=10; multiplyBy++){
            int number=3;
            int product=number*multiplyBy;
            System.out.println(number+"*"+multiplyBy+"="+product);
        }
    }
}
