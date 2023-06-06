package whileLoop;

/* For you to do:**
    Using while loops that print out even numbers from 1 to 13

    **Example Output:**
    2
    4
    6
    8
    10
    12
 */
public class FortyEight {
    public static void main(String[] args) {
        int counter = 1;
        while (counter<=13) {
            if (counter%2==0){
                System.out.println(counter);
            }
            counter++;
        }
    }
}
