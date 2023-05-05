package staticKeywords;

/*
Write a method header on line two with the following specs:
Returns: a String
Name: thirdLetter
Parameters: a String called s

Then complete the method by programming the following behavior
Returns every 3rd letter of the String s, starting from the first letter.

Examples:
thirdLetter("hello there") ==> "hltr"
thirdLetter("technology") ==> "thly"
 */
public class OneHundredThirtyOne {
    static String thirdLetter(String s){
        String thirdLetterOutput = "";
        for (int i = 0; i < s.length(); i+=3) {
            thirdLetterOutput+= s.charAt(i);
        }
        return thirdLetterOutput;
    }

    public static void main(String[] args) {
        System.out.println(thirdLetter("hello there"));
        System.out.println(thirdLetter("technology"));

        }
    }

