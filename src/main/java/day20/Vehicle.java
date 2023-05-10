package day20;

/*
    1) Constructors are used to create an object from a class.
       If there is no constructor, it is impossible to create an object from a class.
    2) Java knows classes are for object creations, because of that Java puts "constructor" in every class automatically.
       Constructor coming from Java will be invisible, it is called "default constructor".
       default constructors ==> public Vehicles(){ }
    3) Java is jealous, when we create our own constructor Java deletes the default one.
    4) What are the differences between "constructors" and "methods"?
       i) "constructors" are for object creations but "methods" are for some actions
       ii) "constructors" do not have return type but "methods" must have.
       iii) The name of "constructors" must match with the name of the Class, but "methods" can use any name.
*/
public class Vehicle {
    String make;
    String model;
    int year;
    double price;

    public Vehicle() {

    }

    public Vehicle(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public Vehicle(String make, String model, double price) {
        this.make = make;
        this.model = model;
        this.price = price;
    }
}
