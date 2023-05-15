package day23;

public class Mammal extends Animal {

    public Mammal() {
        super("Wow!");
        System.out.println("Mammal constructor worked...");
    }

    public Mammal(int num) {
        super("Hi!");
        System.out.println("Mammal constructor with int parameter worked...");
    }

    public Mammal(String s) {
        this();
        System.out.println("Mammal constructor with String parameter worked...");
    }
}
