package staticKeywords;

/* Write a method with the following specs:
    Returns: an integer
    Name: countVowels
    Parameters: a String called s
    Purpose: count the number of vowels in the string s.  Assume s is all lowercase.

    Examples:
    countVowels("obama") ==> 3
    countVowels("happy friday! i love weekends") ==> 9
 */
public class OneHundredThirtyFour {
    static int countVowels(String s){
        int count = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "happy friday! i love weekends";
        int count = countVowels(s);
        System.out.println(count);
    }
}
