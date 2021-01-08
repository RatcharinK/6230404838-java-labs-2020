package harinsalai.ratchanon.lab3;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        System.out.println("Please enter a guess (1-10): ");

        //Generate random number
        Random number = new Random();
        int upperbound = 10;
        int randomnumber = number.nextInt(upperbound);

        //Create Scanner
        Scanner scan = new Scanner(System.in);

        int tried = 0;


    }
}
