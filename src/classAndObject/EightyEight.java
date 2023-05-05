package classAndObject;

public class EightyEight {
    /*
    Create a Class Main
    In this class, you should specify the following attributes: breed, name, color, and following behaviors: bark(), run(), play().
    Create 3 different objects of it: Husky, Bulldog, Labrador with specific attributes and behaviors.

    The output of the program should be as following:
    Husky can bark
    Husky can run
    Husky can play
    ```
    Bulldog can bark
    Bulldog can run
    Bulldog can play
    ```
    Labrador can bark
    Labrador can run
    Labrador can play
     */

    String breed;
    String name;
    String color;

    void bark(){
        System.out.println(breed+" can bark");
    }
    void run(){
        System.out.println(breed+" can run");
    }
    void play(){
        System.out.println(breed+" can play");
    }

    public static void main(String[] args) {
        EightyEight dog=new EightyEight();
        dog.breed="Husky";
        dog.bark();
        dog.run();
        dog.play();

        EightyEight dog1=new EightyEight();
        dog1.breed="Bulldog";
        dog1.bark();
        dog1.run();
        dog1.play();

        EightyEight dog2=new EightyEight();
        dog2.breed="Labrador";
        dog2.bark();
        dog2.run();
        dog2.play();
    }
}
