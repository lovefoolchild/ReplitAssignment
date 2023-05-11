package constructors;

public class StoreProductTester {
    public static void main(String[] args) {
        StoreProduct sp1 = new StoreProduct("Eggs", 3, "Produce", true,10);
        StoreProduct sp2 = new StoreProduct("Paper Towels", 2, 24);
        StoreProduct sp3 = new StoreProduct("Paper Towels", 2);
        sp1.printInfo();
        sp2.printInfo();
        sp3.printInfo();
    }
}
