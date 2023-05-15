package day23;

public class Cat extends Mammal {

    public Cat() {
        super(12);//super() must be in the first lane in constructor body.
                       //In a constructor body we can do just a single constructor call, multiple calls are not allowed.
        System.out.println("Cat constructor worked...");
    }

    public Cat(boolean b) {
        super();//Typing "super()" is optional. If we type, our code will be more readable.
        System.out.println("Cat constructor with boolean parameter worked...");
    }
}
