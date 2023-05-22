package abstractClass;

/* Abstraction:
    Create a Super Class Tea that will have:
    - instance variable teaType;
    - constructor that will initialize
    - unimplemented method addSugar(),

    Create 2 subclasses of Tea as Lemon Tea and Chai Tea.
    In main class create an object of 2 Child and assign them to Parent reference type.
    Execute method addSugar from both classes.

    **Expected Output:**
    For Lemon Tea we need 2 spoons of sugar
    For Chai Tea we need 1 spoon of sugar
 */
public abstract class TeaOneHundredSeventyThree {

    String teaType;

    TeaOneHundredSeventyThree(String teaType){
        this.teaType=teaType;
    }

    abstract void addSugar();
}

class LemonTea extends TeaOneHundredSeventyThree {

    LemonTea(String teaType){
        super(teaType);
    }
    @Override
    void addSugar() {
        System.out.println("For Lemon Tea we need 2 spoons of sugar");
    }
}

class ChaiTea extends TeaOneHundredSeventyThree {

    ChaiTea(String teaType){
        super(teaType);
    }

    @Override
    void addSugar() {
        System.out.println("For Chai Tea we need 1 spoon of sugar");
    }
}

class MainTea {
    public static void main(String[] args) {
        // TeaOneHundredSeventyThree[] tea = {new LemonTea("Lemon Tea"), new ChaiTea("Chai Tea")};
        // for (TeaOneHundredSeventyThree diffTea : tea){
            // diffTea.addSugar();

        TeaOneHundredSeventyThree tea = new LemonTea("Lemon Tea");
        TeaOneHundredSeventyThree tea1 = new ChaiTea("Chai Tea");
        tea.addSugar();
        tea1.addSugar();
    }

}