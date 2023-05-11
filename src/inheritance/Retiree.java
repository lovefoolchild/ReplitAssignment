package inheritance;

public class Retiree extends Student{
    String seniorActivity;

    Retiree(String name, String lastName, int age) {
        super(name, lastName, age);
        seniorActivity="tour";
    }

    void printInfo(){
        System.out.println(name+" "+lastName+" "+age+" "+seniorActivity);
    }
}
