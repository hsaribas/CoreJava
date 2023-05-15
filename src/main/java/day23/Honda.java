package day23;

/*
    1) If we do not put "body" for a method it will be "abstract method".
    2) To make a method "abstract", we have to use "abstract" keyword before the return type.
    3) "abstract method" cannot be put into a regular class, when we create an abstract method, we have to make the
       class abstract.
    4) To make a class abstract, use "abstract" keyword before the "class" keyword.
    5) The method without body is called "abstract method", the method with body is called "concrete method".
    6) "Concrete Child Classes" must "override(implement)" abstract methods from all parents, otherwise Java gives CTE.
       It is not mandatory for "Abstract Child Classes".
    7) "Abstract Classes" may have both "abstract methods" and "concrete methods".
    8) If we want to make a functionality mandatory for all "concrete child classes", make the method "abstract" in parent class.
    9) Can we make an "abstract class" final class?
       "Final Classes" cannot have child classes, we create "abstract classes" to do something mandatory for child classes.
       This is contradiction because of that Java does not allow to make an abstract class "final".
    10) "Abstract Methods" were created to override, if we make an abstract method "private" it cannot be overridden, therefore
        Java does not allow to make an abstract method "private".
    11) We cannot create objects from "abstract classes" because "abstract classes" have something un-complete like
        "abstract methods".
        Note: "Abstract Classes" are classes, therefore they have "constructors", but the constructors cannot create objects.
    12) If any abstract method was overridden by any "concrete class (A)", it is not mandatory to override the abstract
        method for the concrete child classes of the "concrete class (A)".
*/
public abstract class Honda {

    public abstract void engine();

    public void musicSystem() {

        System.out.println("The most updated music system...");
    }
}
