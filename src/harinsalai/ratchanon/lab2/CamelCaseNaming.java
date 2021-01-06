package harinsalai.ratchanon.lab2;

public class CamelCaseNaming {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("CamelCaseNaming <First word> <Second word> ");
            System.exit(0);
        }
        String first_word = args[0];
        String second_word = args[1];

        //set upper and lower letter
        String first_upletter = first_word.substring(0,1).toUpperCase();
        String second_upletter = second_word.substring(0,1).toUpperCase();
        String first_lowletter = first_word.substring(1).toLowerCase();
        String second_lowletter = second_word.substring(1).toLowerCase();

        String word = first_upletter+first_lowletter+second_upletter+second_lowletter;

        System.out.println( "The first word is " + first_word + "\n" +
                            "The first word is " + second_word + "\n" +
                            "The concatenate with camel case is " + word);
    }
}
