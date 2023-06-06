package exceptionHandling;

/*
Create a custom Exception class
In main class create a method that will check students grade
If students grade is >90 then below exception should be thrown
If students grade is below 90 print "You are a great student"
In main method calls method gradeCheck and handle an Exception

**Expected Output:**
SyntaxStudentException: You are an exceptionally awesome student
 */
public class Exception {

    static void checkGrade() throws java.lang.Exception {

    }
    public static void main(String[] args) {
        try {
            int grade = 19;
            if (grade > 90) {
                throw new java.lang.Exception("You are an exceptionally awesome student");
            } else {
                System.out.println("You are a great student");
            }
        } catch (java.lang.Exception e) {
            System.out.println("SyntaxStudentException: "+e.getMessage());
        }
    }
}
