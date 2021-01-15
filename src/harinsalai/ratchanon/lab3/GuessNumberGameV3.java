package harinsalai.ratchanon.lab3;

import java.util.Scanner;

public class GuessNumberGameV3 {
    static int correctNum;
    static int minNum = 1, maxNum = 10;
    static int maxTries = 3;

    public static void main(String[] args) {
        configGame();
        genAnswer();
        playGame();
    }

    //create scanner
    static Scanner scan = new Scanner(System.in);

    static void configGame() {
        //min and max possible answer
        System.out.print("Enter the min and the max value:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        //check what is a higher number to make maxNum and minNum
        if (num1 > num2){
            minNum = num2;
            maxNum = num1;
        }
        else if (num2 > num1){
            minNum = num1;
            maxNum = num2;
        }
        //number of tries
        System.out.print("Enter the number of tries:");
        maxTries = scan.nextInt();

    }

    //create random number (like V2)
    static void genAnswer() {
        correctNum = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
    }

    static void playGame() {
        //create boolean for restartable
        boolean countinueplay = true;
        //start for guessing
        boolean wingame = false;
        //Loop
        while (countinueplay == true) {
            int tried = 0;
            while (wingame == false) {
                System.out.print("Please enter a guess (" + minNum + " - " + maxNum + "):");
                int guess = scan.nextInt();
                //out of answer range
                if (guess < minNum || guess > maxNum){
                    System.out.println("The guess number must be in the range " + minNum + " and " + maxNum);
                }
                else if (guess > minNum || guess < maxNum) {
                    //correct answer
                    if (guess == correctNum) {
                        System.out.println("Congratulations ! That's correct");
                        wingame = true;
                    }
                    //incorrect answer
                    else if (guess > correctNum) {
                        tried++;
                        System.out.println("Please type a lower number! Number of remaining tries:" + (maxTries-tried));
                    } else if (guess < correctNum) {
                        tried++;
                        System.out.println("Please type a higher number! Number of remaining tries:" + (maxTries-tried));

                    }
                }
                //out of tries
                if (maxTries == tried) {
                    break;
                }

            }
            System.out.print("If want to play again type 'y' to continue or 'q' to quit:");
            String restartgame = scan.next().toLowerCase();
            if (restartgame.equals("y")) {
                wingame = false; //return to false for win a game statement
                genAnswer();
                playGame();
            }
            else {
                countinueplay = false;
            }
        }
    }
}

