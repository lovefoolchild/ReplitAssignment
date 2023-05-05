package staticKeywords;

/* For you to do:
    Create two methods:
    The first method should be a non-static method that will print out the following message:
    "Programming is amazing."
    The second method should be a static method that will print out the following message:
    "Java is awesome."
    Execute both methods

    **Expected Output:**
    Programming is amazing.
    Java is awesome.
 */
public class OneHundredTwentySeven {
    String message(String sentence){
       return sentence;
    }
    public static String message2(String sentence2){
        return sentence2;
    }

    public static void main(String[] args) {
        OneHundredTwentySeven obj = new OneHundredTwentySeven();
        System.out.println(obj.message("Programming is amazing."));
        System.out.println(message2("Java is awesome."));
    }
}
