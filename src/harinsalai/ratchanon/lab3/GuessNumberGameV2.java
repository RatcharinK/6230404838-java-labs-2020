package harinsalai.ratchanon.lab3;

import java.util.Scanner;

public class GuessNumberGameV2 {
    static int correctNum;
    static int minNum = 1, maxNum = 10;
    public static void main(String[] args) {
        genAnswer();
        playGame();
    }
    //create random number
    static void genAnswer(){
        correctNum = minNum + (int)(Math.random()*((maxNum-minNum)+1));
    }

    //using method from GuessNumberGame
    static void playGame(){
        //Create Scanner
        Scanner scan = new Scanner(System.in);

        int remaining_tries = 3; //Create number of remaining of tries variable

        //Loop
        for (int i = 0; i < 5 ; i++) {
            System.out.print("Please enter a guess (1-10):");
            int guess = scan.nextInt();
            remaining_tries--;

            if (guess == correctNum) {
                System.out.println("Congratulations ! That's correct");
                System.exit(0);
            } else if (guess > correctNum) {
                System.out.println("Please type a lower number! Number of remaining tries:" + remaining_tries);
            } else if (guess < correctNum){
                System.out.println("Please type a higher number! Number of remaining tries:" + remaining_tries);
            }
            if (remaining_tries == 0) {
                System.exit(0);
            }
        }
    }
}
