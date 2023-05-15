package day23;

public class Dog extends Mammal {

    public Dog() {
        super(11);
        System.out.println("Dog constructor worked...");
    }

    public Dog(int x) {
        this();
        System.out.println("Dog constructor with int parameter worked...");
    }
}
