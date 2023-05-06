package day02;

public class Day02Variables {

    public static void main(String[] args) {
        System.out.println(age);
        System.out.println(height);
        System.out.println(weight);

        //If you create a variable inside the "main method", Java will accept them as "static" automatically

        //Create a char variable
        //Do not forget to put the value between single quotes
        //Default value of char is the character whose value is zero
        char initial = 'S';

        //Create a boolean variable
        //Default value of a boolean is false
        boolean isOld = true;
        boolean isAlive = false;

        //Create a byte variable
        byte ageOfStd = 13;

        //Create a short variable
        short populationOfVillage = 21000;

        //Create a long variable
        //Do not forget to put L to the end when ypu put a long variable
        long populationOfWorld = 7123456789L;
    }

    //How to create a variable
    //     Data Type - Variable Name - Equal Sign - Value - Semi Colon
    static int age = 12;
    static int height = 183;

    //Create a double variable
    public static double weight = 77.7;

    //Note: If you don't type any access modifier, it means the access modifier is "default".

        /*
            Data Types In Java

            1)Primitive Data Types:
                i)Those data types were created by Java, we cannot create any primitive data type
                ii)Primitive data types are 8
                    a)byte - short - int - long - float - double / char - boolean
                        char: It is for single characters like A, h, ?, !, etc.
                        boolean: It is for true-false values
                        byte: It is used for the values from -128 to 127. It is for whole numbers.
                        short: It is ued for the values -32 thousand sth to positive 32 thousand sth. It is for whole numbers.
                        int: It is used for the values -2 billion sth to 2 billion sth. It is for whole numbers.
                        long: It is used for the values from .... to .... It is for whole numbers.
                        float: It is used for decimals. float uses memory less than double.
                               When you create float as data type, you have to put 'F' or 'f' at the end.
                               float has 7 digits at most in decimal part.
                        double: It is used for decimals. double is used for scientific researches.
                               double has 16 digits at most in decimal part.

            2)Non-Primitive Data Types
                1)Those data types can be created by Java and Java Developers.
                String is a non-primitive data type.
                String data type is used for multiple characters.

            Note: What is the difference between "primitive" and "non-primitive" data types?
                i) Primitive data types starts with lower cases, "non-primitive" data types starts with upper cases.
                ii) Primitive data types can be created by Java, but "non-primitive" data types can be created by Java
                and Java Developers.
                iii) Primitive data types use different size of memory, but "non-primitive" data types use memory same.
                iv) Primitive data types have just values in it, but "non-primitive" data types have values and "methods"
                in it.
        */

    String nameOfStudent = "Mark Twain";
    String stdId = "Mt2022_01";
}
