package harinsalai.ratchanon.lab3;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        //Generate random number
        Random number = new Random();
        int upperbound = 10;
        int randomnumber = number.nextInt(upperbound);

        //Create Scanner
        Scanner scan = new Scanner(System.in);

        int remainingtries = 3; //Create number of remaining tries variable

        //Loop
        for (int i = 0; i < 5 ; i++) {
            System.out.print("Please enter a guess (1-10):");
            int guess = scan.nextInt();
            remainingtries--;
            if (guess == randomnumber) {
                System.out.println("Congratulations ! That's correct");
                System.exit(0);
            }
            else if (guess > randomnumber) {
                System.out.println("Please type a lower number! Number of remaining tries:" + remainingtries);
            }
            else if (guess < randomnumber) {
                System.out.println("Please type a higher number! Number of remaining tries:" + remainingtries);
            }
            if (remainingtries == 0) {
                System.exit(0);
            }
        }
    }
}
