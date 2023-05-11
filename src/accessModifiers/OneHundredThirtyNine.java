package accessModifiers;

/* Create a method that will be available to all classes in your project with following specifications:
Returns: a String
Name: alphabetical
Parameters: a String called str
Purpose: Return a string that is composed of each letter as long as the letter is later on in the alphabet
than its previous one.  You can assume actual parameters are lowercase.
See below examples.

Additional Info:
You can use < and > to compare characters (not Strings), where characters later on in the alphabet are "greater".  Examples:
'a' < 'b' ==> True
'a' < 'a' ==> False
'a' > 'b' ==> False

Examples:
alphabetical("hello") ==> "hlo"
alphabetical("software") ==> "stwr"
alphabetical("language") ==> "lnug"

**Expected Output:**
hlo
stwr
lnug
 */
public class OneHundredThirtyNine {
        public static String alphabetical (String str){
            String result="";
            char maxChar='a'-1;
            for (int i = 0; i < str.length(); i++) {
                char currentChar=str.charAt(i);
                if (currentChar > maxChar){
                    result+=currentChar;
                }
                maxChar=currentChar;
            }
            return result;
        }

    public static void main(String[] args) {
        System.out.println(alphabetical("hello"));
        System.out.println(alphabetical("software"));
        System.out.println(alphabetical("language"));
    }
}
