package inheritance;

public class Employee extends Person{
    int salary;

    Employee(String name, String lastName, int age) {
        super(name, lastName, age);
        salary=35000;
    }

    void printInfo(){
        System.out.println(name+" "+lastName+" "+age+" "+salary);
    }
}
