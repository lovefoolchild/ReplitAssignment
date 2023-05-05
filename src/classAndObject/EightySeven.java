package classAndObject;

public class EightySeven {
    /*
    Create a class named 'Main' with specific attributes.
    Create two objects of that class in which you will be assigning the following values and then print them.
        carColor='Black'
        carYear=2019
        carMake='BMW'
        carColor='White'
        carYear=2018
        carMake='Toyota'

     **Expected Output:**
        Car color is Black and car year is 2019 and car model is BMW
        Car color is White and car year is 2018 and car model is Toyota
     */

    String carColor;
    int carYear;
    String carMake;

    public static void main(String[] args) {
        EightySeven obj=new EightySeven();
        obj.carColor="Black";
        obj.carYear=2019;
        obj.carMake="BMW";
        System.out.println("Car color is "+obj.carColor+" and car year is "+obj.carYear+" and car model is "+obj.carMake);

        EightySeven obj1=new EightySeven();
        obj1.carColor="White";
        obj1.carYear=2018;
        obj1.carMake="Toyota";
        System.out.println("Car color is "+obj1.carColor+" and car year is "+obj1.carYear+" and car model is "+obj1.carMake);
    }
}
