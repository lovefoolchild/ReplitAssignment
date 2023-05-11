package constructors;

public class SyntaxTechnologies {
    String schoolName;
    int batch;
    int year;
    String lastDayOfClass;

    SyntaxTechnologies(){
        System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);
    }
    SyntaxTechnologies(String schoolName, int batch, int year, String lastDayOfClass){
        System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);
    }
    void printInfo(){
        System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);
    }
}
