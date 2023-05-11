package inheritance;

public class Student extends Employee{
    int grade;

    Student(String name, String lastName, int age) {
        super(name, lastName, age);
        grade=10;
    }

    void printInfo(){
        System.out.println(name+" "+lastName+" "+age+" "+grade);
    }
}
