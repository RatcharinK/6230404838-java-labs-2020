package harinsalai.ratchanon.lab2;
/**
 * This Patient program is to accept three arguments:
 * patient name, patient age and country.
 *  Its output format is
 *   Patient's name is <patient_name>
 *   Patient's age is <patient_age>
 *   <patient_name> comes from <country>
 *
 * Author: Ratchanon Harinsalai
 * ID: 623040483-8
 * Sec: 1
 * Date:
 *
 **/

public class Patient {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.err.println("Patient <patient_name> <patient_age> <country>");
            System.exit(0);
        }
        String patient_name = args[0];
        String patient_age = args[1];
        String country = args[2];
        System.out.println( "Patient's name is " + patient_name + "\n" +
                            "Patient's age is " + patient_age + " \n" +
                            patient_name + " comes from " + country);
    }
}
