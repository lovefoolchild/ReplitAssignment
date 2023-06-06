package encapsulation;

/* Create Class EncapsulationDemo that will have 2 variables empName and empAge;
    Create the getter/setter methods for each variable.
    In Main Class and main method
    Using setter methods assign the values as "Mario" and "32"
    Using getter methods print the values as below outputs.

     **Expected Output:**
    Employee Name: Mario
    Employee Age: 32
 */
public class EncapsulationDemo2 {
    private String empName;
    private int empAge;

    public EncapsulationDemo2(String empName, int empAge){
        this.empName=empName;
        this.empAge=empAge;
    }

    public String setEmpName(String empName){
        return empName;
    }

    public int setEmpAge(int empAge){
        return empAge;
    }
    public String getEmpName(){
        return empName;
    }

    public int getEmpAge(){
        return empAge;
    }
}

class Main179 {
    public static void main(String[] args) {
        EncapsulationDemo2 eDemo2 = new EncapsulationDemo2("Mario", 32);
        System.out.println("Employee Name: "+eDemo2.getEmpName());
        System.out.println("Employee Age: "+eDemo2.getEmpAge());
    }
}