package logicalOperators;

import java.util.Scanner;

/* For you to do:
    Take 2 boolean inputs from a user:
    "Are you thirsty?"
    "Are you sleepy?"
    If user is thirsty and not sleepy--> drink=water
    If user is thirsty and sleepy--> drink=coffee
    If user is not thirsty and sleepy --> drink=tea
    Otherwise drink="nothing"

    Output:
    - Looks like you need to drink \_\_\_
 */
public class ThirtySeven {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Are you thirsty?");
        boolean thirst=scanner.nextBoolean();
        System.out.println("Are you sleepy?");
        boolean sleep=scanner.nextBoolean();
        if (thirst==true && sleep==false){
            System.out.println("Looks like you need to drink water");
        } else if (thirst==true && sleep==true) {
            System.out.println("Looks like you need to drink coffee");
        } else if (thirst==false && sleep==true) {
            System.out.println("Looks like you need to drink tea");
        } else {
            System.out.println("Looks like you need to drink nothing");
        }
    }
}
