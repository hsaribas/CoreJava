package day03;

public class Day03DataTypes {
    /*
        Type casting: Converting a number primitive data to another number
        primitive data type.

            byte   -   short   -    int    -    long    -    float    -    double.
        Note 1: If you convert small data type to large data type, it is called "Auto Widening".
        Note 2: If you convert large data type to small data type, it is called "Explicit Narrowing".

        Wrapper Class: Wrapper classes are classes for primitive data types.
                Primitive              Wrapper Class
                byte                   Byte
                short                  Short
                **int                  Integer
                long                   Long
                float                  Float
                double                 Double
                **char                 Character
                boolean                Boolean

                Memory Usage in Java
                There are 2 types of memories in Java
                1)Stack Memory ==> Small
                2)Heap Memory ==> Huge
    */
    public static void main(String[] args) {
        //Auto Widening
        byte age = 12;
        int myAge = age;

        short populationOfAVillage = 21000;
        double myPopulationOfAVillage = populationOfAVillage;

        //Explicit Narrowing
        double x = 23.45;
        long y = (long) x;

        String name = "Mark Twain";
        System.out.println(name.toUpperCase());//MARK TWAİN
        System.out.println(name.toLowerCase());//mark twain

        //Find the number of characters in name string variable.
        System.out.println(name.length());//10

        //Wrapper Classes
        Byte yourAge = 13;
        Boolean isOld = true;

        //If a method is static, you can access to the method by using class name.
        System.out.println(Byte.MIN_VALUE);//-128
        System.out.println(Integer.MIN_VALUE);//-2147483648
        System.out.println(Float.MIN_VALUE);//1.4E-45
        System.out.println(Long.MAX_VALUE);//9223372036854775807
        System.out.println(Double.MAX_VALUE);//1.7976931348623157E308

        //Auto Boxing
        int a = 12;
        Integer b = a;

        //Un-Boxing
        int c = b;
    }
}

