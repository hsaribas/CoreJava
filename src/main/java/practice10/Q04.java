package practice10;

public class Q04 {
    /*
        Count the frequency of the letters in a given String as the format below.
        Input: String str = "Java is so good";
        Output: String strOutput = "J1 a2 v1 i1 s2 o3 g1 d1";
    */
    public static void main(String[] args) {
        String str = "Java is so good";
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int counter = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    counter++;
                }
            }
            if (!output.toString().contains(String.valueOf(str.charAt(i)))) {
                output.append(str.charAt(i)).append(counter).append(" ");
            }
        }
        System.out.println(output);
    }
}
