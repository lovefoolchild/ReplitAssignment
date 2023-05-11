package ThisKeyword;
/* In CarObjects class:
    Create instance variables as below.
        - model
        - price,
        - quantity

Create a constructor that will initialize instance variables.
Create a method with name carStockValue. Write logic to calculate the total values of cars in stock and print the result.
Run the application in Main Class

**Expected Output:**
Toyota 2019 Stock Value 2500000.0
BMW 2019 Stock Value 652980.0

Assignment Goal: Clean Code, This Keyword, Method Creation, Mathematic Operations.
 */
public class CarObjects {
    String model;
    double price;
    double quantity;

    CarObjects(String model, int price, int quantity){
        this.model=model;
        this.price=price;
        this.quantity=quantity;
    }

    double carStockValue(){
        return price * quantity;
    }

    void printInfo(){
        System.out.println(model+" Stock Value "+carStockValue());
    }
    public static void main(String[] args) {
        CarObjects carObjects1 = new CarObjects("Toyota 2019", 50000, 5);
        carObjects1.printInfo();
        CarObjects carObjects2 = new CarObjects("BMW 2019", 54415, 12);
        carObjects2.printInfo();
    }
}
