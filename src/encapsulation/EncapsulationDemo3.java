package encapsulation;

/* Create Class EncapsulationDemo
    Create two variable as shown below.
    private String empName=John;
    private int empAge=30;
    Create only getters methods for each variable.
    Print the values of each variable as shown below.

    **Expected Output:**
    Employee Name: John
    Employee Age: 30
 */
public class EncapsulationDemo3 {
    private String empName;
    private int empAge;

    public EncapsulationDemo3(String empName, int empAge){
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

class Main180 {
    public static void main(String[] args) {
        EncapsulationDemo3 eDemo3 = new EncapsulationDemo3("John", 30);
        System.out.println("Employee Name: "+eDemo3.getEmpName());
        System.out.println("Employee Age: "+eDemo3.getEmpAge());
    }
}