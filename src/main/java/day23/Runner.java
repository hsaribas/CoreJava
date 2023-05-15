package day23;

public class Runner {
    /*
        1) super() is used to call constructors from parent class.
            i) If the parent class has multiple constructors by the help of the parameters we can select
               any constructor.
            ii) Typing "super()" is optional but if you use super() with parameters you have to type it.
            iii) super() must be in the first line in constructor body.
            iv) super() can be used just once in a constructor body.

        2) this() is used to call constructors from the class itself.
            i) If the class has multiple constructors by the help of the parameters you can select
               any constructor.
            ii) Typing "this()" is not optional you have to type it even it has parameter or not.
            iii) this() must be in the first line in constructor body.
            iv) this() can be used just once in a constructor body.

           Note: super() and this() cannot be used together in the same constructor body.

        3) "super" keyword is used to select any variable or any method from parent class.
           "this" keyword is used to select any variable or any method from the class itself.

           Note: What is the difference between "super" and "super()"?
                 "super" is used to call variable or methods.
                 "super()" is used to call constructors from the parent class.

           Note: What is the difference between "this" and "this()"?
                 "this" is used to call variable or methods.
                 "this()" is used to call constructors from the class itself.
    */
    public static void main(String[] args) {
        //Cat c = new Cat();
        //Bird b = new Bird();
        //Cat d = new Cat(true);
        //Dog e = new Dog();
        Dog f = new Dog(14);
    }
}
