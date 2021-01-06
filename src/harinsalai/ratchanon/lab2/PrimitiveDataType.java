package harinsalai.ratchanon.lab2;

/**
 * This PrimitiveDataType program don't accept any arguments:
 *
 * Its output format is
 * <boolean>
 * <byte>
 * <float>
 * <long>
 * <int>
 * <char>
 * <short>
 * <double>
 *
 * Author: Ratchanon Harinsalai
 * ID: 623040483-8
 * Sec: 1
 * Date:
 *
 **/

public class PrimitiveDataType {
    public static void main(String[] args) {

        //creat variables
        boolean boolean_test= true;
        byte byte_test = 120;
        float float_test= 1.12345f;
        long long_test = 900000000000000000l;
        int int_test= 2000000000;
        char char_test = 'a';
        short short_test = 32000;
        double double_test= 1.123456789123;

        //run
        System.out.println( boolean_test + "\n" +
                            byte_test + "\n" +
                            float_test + "\n" +
                            long_test + "\n"+
                            int_test + "\n" +
                            char_test + "\n" +
                            short_test + "\n" +
                            double_test);
    }

}
