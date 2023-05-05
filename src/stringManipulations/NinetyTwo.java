package stringManipulations;

public class NinetyTwo {
    public static void main(String[] args) {
        /*
        **For you to do:**
        Validate if the string ends with "u" prints the boolean value accordingly.
        Validate if the string ends with "world" prints the boolean value accordingly.
        Validate if the string ends with "are" prints the boolean value accordingly.
        Validate if the string ends with "you" prints the boolean value accordingly.
         */
        String s1="hello how are you";

        boolean endsWithU = s1.endsWith("u");
        System.out.println(endsWithU);
        boolean endsWithWorld = s1.endsWith("world");
        System.out.println(endsWithWorld);
        boolean endsWithAre = s1.endsWith("are");
        System.out.println(endsWithAre);
        boolean endsWithYou = s1.endsWith("you");
        System.out.println(endsWithYou);
    }
}
