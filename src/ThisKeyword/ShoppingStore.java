package ThisKeyword;
/* In ShoppingStore class, create variables as below.
        - item,
        - price,
        - quantity

    Create a constructor to initialize instance variables.
    Create a method with name itemTotalPrice.
    Write a logic to calculate the total values of items in stock. and print the result.
    Return the total value.

    In Main Class:
    Create two Object of ShoppingStore and pass the parameters to Constructor.
    Then using each object call the method itemTotalPrice.
    Store the returned value of each object.
    Calculate sum of both object and print the result.

    Output:
    Blanket Total Value 99.98
    Mattress Total Value 439.18
    You purchased 539.16 Today

    Assignment Goals: Clean Code, proper naming convention, Choosing Variable Datatype,
    This Keyword, Method Creation, Mathematic Operations, method return types.
 */
public class ShoppingStore {
    String item;
    double price;
    int quantity;

    ShoppingStore(String item, double price, int quantity){
        this.item=item;
        this.price=price;
        this.quantity=quantity;
    }

    double itemTotalPrice(){
        double totalPrice = totalValue();
        System.out.println(item+" Total Value "+totalPrice);
        return totalPrice;
    }
    double totalValue(){
        return price*quantity;
    }

    public static void main(String[] args) {
        ShoppingStore item1 = new ShoppingStore("Blanket", 49.99, 2);
        ShoppingStore item2 = new ShoppingStore("Mattress", 219.59, 2);

        double item1Total = item1.itemTotalPrice();
        double item2Total = item2.itemTotalPrice();
        double total = item1Total+item2Total;

        System.out.println("You purchased "+total+" Today");
    }
}
