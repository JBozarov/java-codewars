import java.util.List;

public class SpeedifyClass {

    public static void main(String[] args) {

        System.out.println(speedify("BA"));
        System.out.println(speedify("HELLOWORLD"));
    }


    public static String speedify(final String input) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";;
        String result = "";

        for (int i = 0; i<input.length(); i++ ) {
            String tempString = " ".repeat(input.charAt(i))
            for (int i = 0; i<result.length(); i++ ) {
                if (result.charAt(i) == ' ') {
                    result =  result.substring(0, i) +
                }
            }
           result = " ".repeat(alphabet.indexOf(input.charAt(i))) + input.charAt(i);
        }
        System.out.println(result.length());
        return result;
    }
}
