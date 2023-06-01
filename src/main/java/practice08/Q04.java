package practice08;

public class Q04 {
    /*
        Create a method that joins the given Strings.
        Input => "Please", "join", "the", "given", "words"
        Output => "Please join the given words"
    */
    public static void main(String[] args) {
        joinStrings("Please", "join", "the", "given", "words");
    }

    public static void joinStrings(String... str) {
        StringBuilder result = new StringBuilder();

        for (String w : str) {
            result.append(w).append(" ");
        }
        System.out.println(result);
    }
}
