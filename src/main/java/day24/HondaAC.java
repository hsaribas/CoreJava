package day24;

interface HondaAC {
    /*
        We can not create object from interfaces.
        Interfaces do not have constructors but "abstract classes" have.
    */

    /*
        Variables:
        1) Every variable is "public", "static" and "final" in interfaces.
        2) If you want to type "public", "static" and "final" explicitly to make your code more readable, you can do it.
        3) Final variables must be initialized because of that every variable must be initialized in interfaces.
        4) If you have some variables whose signatures are same in parent interfaces, when you call them you have to declare
           the name of the interface, otherwise it will give compile time error.
    */

    String make = "Samsung";
    double price = 890.00;
    double number = 123;

    /*
        Methods:
        1) All methods in an interface must be abstract.
        2) Using "abstract" keyword is optional for methods.
        3) All methods in an interface must be "public".
        4) Normally we can not create method with body in an interface. But java created "default method" you can use them
           in an interface, they will have body.
    */
    void cool();

    void run();

    //1) "default" over here is not "access modifier", it is for creating method with body in an interface.
    public default void bacteriaKiller() {

        System.out.println("This AC kills %99.9 bacterias...");
    }

    //2) By using "static" keyword, you can create method with body in an interface.
    static void climateCool() {

        System.out.println("This AC cools according to the climate...");
    }
}
