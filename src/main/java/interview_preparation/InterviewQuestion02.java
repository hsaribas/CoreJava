package interview_preparation;

public class InterviewQuestion02 {
    /*
        What are the differences between "abstract class" and "interface"?

        1) Methods: a) "Abstract class" can have both "abstract" and "concrete" method.
                       "Interface" can have just "abstract" methods.
                       Note: We can create method in interface with body by using "default" and "static" keywords.
                    b) Methods in abstract class can use any access modifier.
                       Methods in interface are definitely public.

        2) Variables: "Abstract class" can have every type of variable.
                      "Interface" can have only "public", "static" and "final" variables.
                      Note: Variables are final in interface, because of that they must be initialized.
                            Variables may or may not be final in abstract classes, because of that it is not mandatory to initialize.

        3) Note: By the help of the "interface" we can create "multiple parents" for a class.
                 When you use "abstract class" it is impossible to create "multiple parents".

        4) Class "extends" class, Interface "extends" Interface, Class "implements" Interface, Interface can NOT be "child of a class".
    */
}
