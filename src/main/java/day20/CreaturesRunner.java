package day20;

import day21.Animal;
import day21.Bird;
import day21.Cat;
import day21.Dog;

public class CreaturesRunner {
    /*
        1) "private" class members can not be inherited by Child Class from Parent Class.(impossible to inherit)
        2) "public" class members can be inherited.(Always can be inherited)
        3) "protected" class members can be inherited.(Always can be inherited)
        4) "default" class members can be inherited from same package.(You can not inherit it from other packages)
    */
    /*
        Note 1: When we call a variable in a parent-child relationship look at the data type of the object.
        Note 2: When we call a method in a parent-child relationship look at the constructor of the object.
        Note 3: There is "IS-A" relationship from "child class" to "parent class".
        Note 4: There is "HAS-A" relationship from "parent class" to "child class".
        Note 5: If there is no "parent-child relationship" you can not have "HAS-A" or "IS-A" relationship.
    */
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.weight();
        animal.volume();

        Bird bird = new Bird();
        bird.tweet();
        bird.eat();
        bird.move();
        bird.drink();
        bird.weight();

        Cat cat = new Cat();
        cat.meow();
        cat.drink();
        cat.eat();
        cat.move();

        Dog dog = new Dog();
        dog.bark();
        dog.eat();
        dog.move();
        dog.drink();
        dog.volume();
    }
}
