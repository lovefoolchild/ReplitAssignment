package staticKeywords;

/* Write a method with the following specs:
    Returns: a String
    Name: surround
    Parameters: a String called s, a String called search_term
    Then complete the method by programming the following behavior
    Return a new String built from s that has every instance of the search term surrounded by parentheses
    See below examples.

    Examples:
    surround("abcabcabc",'c') ==> "ab(c)ab(c)ab(c)"
    surround("technology",'o') ==> "techn(o)l(o)gy"
 */
public class OneHundredThirtyFive {
    /* static String surround(String s, String search_term){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==search_term.charAt(0)){
                sb.append("(").append(s.charAt(i)).append(")");
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
        } */

    static String surround(String s,String search_term){
        return s.replaceAll(search_term,"("+search_term+")");
    }
    public static void main(String[] args) {
        String s = "abcabcabc";
        String search_term = "c";
        System.out.println(surround(s,search_term));
    }
    }

