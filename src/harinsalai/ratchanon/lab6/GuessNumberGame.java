package harinsalai.ratchanon.lab6;

import java.util.Scanner;

public class GuessNumberGame extends Game {
    protected int minNum;
    protected int maxNum;
    protected int correctNum;
    protected int maxTries;
    protected static int numOfGame = 0;

    public GuessNumberGame() {
        this.minNum = 1;
        this.maxNum = 10;
        this.correctNum = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
        this.maxTries = 3;
        numOfGame++;
    }

    public GuessNumberGame(int minNumber,int maxNumber) {
        this.minNum = minNumber;
        this.maxNum = maxNumber;
        this.correctNum = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
        this.maxTries = 3;
        numOfGame++;
    }

    public GuessNumberGame(int minNumber,int maxNumber,int maxTriesnumber) {
        this.minNum = minNumber;
        this.maxNum = maxNumber;
        this.correctNum = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
        this.maxTries = maxTriesnumber;
        numOfGame++;
    }

    //getter and setter of MinNum
    public int getMinNum() {
        return this.minNum;
    }
    public void setMinNum(int minNumNew) {
        this.minNum = minNumNew;
    }

    //getter and setter of MaxNum
    public int getMaxNum() {
        return this.maxNum;
    }
    public void setMaxNum(int maxNumNew) {
        this.minNum = maxNumNew;
    }

    //getter and setter of MaxTries
    public int getMaxTries() {
        return this.maxTries;
    }
    public void setMaxTries(int maxTriesNew) {
        this.minNum = maxTriesNew;
    }

    //getter of NumOfGames
    public static int getNumOfGames() {
        return numOfGame;
    }

    //create scanner
    Scanner scan = new Scanner(System.in);

    public void playGame() {
        int tries = 0;
        while (tries < maxTries) {
            System.out.print("Please enter a guess " + "(" + this.minNum+ "-" + this.maxNum + ") :");
            int inputnumber = scan.nextInt();
            if (inputnumber == correctNum ) {
                System.out.print("Confratulation! That's correct");
                break;
            }

            else if (inputnumber < correctNum) {
                tries++;
                System.out.println("Please try a higher number! Number of remaining tries: "+ (maxTries-tries));
            }

            else if (inputnumber > correctNum) {
                tries++;
                System.out.println("Please try a lower number! Number of remaining tries: "+ (maxTries-tries));
            }
        }
    }

    @Override
    public String toString() {
        return "Game name : GuessNumberGame, Num of players : " + getNumOfGames() + " , Min is : " + minNum +
                ", Max is : " + maxNum + ", Number of tries is " + maxTries;
    }
}
