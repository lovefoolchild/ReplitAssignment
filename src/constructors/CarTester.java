package constructors;

public class CarTester {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Prius",4,120,30000);
        Car car1 = new Car("Toyota", "Prius",120,30000);
        Car car2 = new Car(4,120,30000);
        Car car3 = new Car("Toyota", "Prius",4);
        car.printInfo();
        car1.printInfo();
        car2.printInfo();
        car3.printInfo();
    }
}
