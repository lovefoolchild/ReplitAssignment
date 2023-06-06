package encapsulation;

/* Create Class EncapsulationDemo
    Create two variable as shown below.
    private String empName;
    private int empAge;
    Create the getter/setter methods for each variable.

    In Main Class and main method.
    Using setter methods assign the values as "John" and "30"
    Using getter methods print the values as below outputs.

    **Expected Output:**
    Employee Name: John
    Employee Age: 30
 */
public class EncapsulationDemo {
    private String empName;
    private int empAge;

    public EncapsulationDemo(String empName, int empAge) {
        this.empName=empName;
        this.empAge=empAge;
    }

    public String setEmpName(String empName) {
        return empName;
    }

    public int setEmpAge(int empAge) {
        return empAge;
    }
    public String getEmpName() {
        return empName;
    }

    public int getEmpAge() {
        return empAge;
    }
}

class Main178 {
    public static void main(String[] args) {
        EncapsulationDemo eDemo = new EncapsulationDemo("John", 30);
        System.out.println("Employee Name: "+eDemo.getEmpName());
        System.out.println("Employee Age: "+eDemo.getEmpAge());
    }
}