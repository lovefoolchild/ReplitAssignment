package inheritance;

/* Create four classes (Person, Employee, Student, Retiree)

* Have properties

For Person: name(String)
For Person: lastName(String)
For Person: age(int)

For Employee: salary(int)
For Student: grade(int)

For Retiree: seniorActivity(String)

At Employee, Student, Retiree Class have a print method in each that prints the properties in line as shown in the output

Create multilevel inheritance: Person --> Employee --> Student --> Retiree

From your Main class create objects of the Employee, Student and Retiree classes and call the print method.

**Expected Output:**

```
Joe Smith 35 35000
Adam Smith 15 10
Frank Smith 15 tour

 */
public class Person{
    String name;
    String lastName;
    int age;

    Person(String name, String lastName, int age){
        this.name=name;
        this.lastName=lastName;
        this.age=age;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Joe", "Smith", 35);
        employee.printInfo();
        Student student = new Student("Adam", "Smith", 15);
        student.printInfo();
        Retiree retiree = new Retiree("Frank", "Smith", 15);
        retiree.printInfo();
    }
}
