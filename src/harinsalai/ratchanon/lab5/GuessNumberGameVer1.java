package harinsalai.ratchanon.lab5;

import java.util.Scanner;

public class GuessNumberGameVer1 {
    protected int minNum;
    protected int maxNum;
    protected int correctNum;
    protected int maxTries;
    protected static int numOfGame = 0;

    public GuessNumberGameVer1() {
        this.minNum = 1;
        this.maxNum = 10;
        this.correctNum = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
        this.maxTries = 3;
        numOfGame++;
    }

    public GuessNumberGameVer1(int minNumber,int maxNumber) {
        this.minNum = minNumber;
        this.maxNum = maxNumber;
        this.correctNum = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
        this.maxTries = 3;
        numOfGame++;
    }

    public GuessNumberGameVer1(int minNumber,int maxNumber,int maxTriesnumber) {
        this.minNum = minNumber;
        this.maxNum = maxNumber;
        this.correctNum = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
        this.maxTries = maxTriesnumber;
        numOfGame++;
    }

    //getter
    public int getMinNum() {
        return this.minNum;
    }

    public int getMaxNum() {
        return this.maxNum;
    }

    public int getMaxTries() {
        return this.maxTries;
    }

    public static int getNumOfGames() {
        return numOfGame;
    }

    //setter
    public void setMinNum(int minNumNew) {
        this.minNum = minNumNew;
    }

    public void setMaxNum(int maxNumNew) {
        this.minNum = maxNumNew;
    }

    public void setMaxTries(int maxTriesNew) {
        this.minNum = maxTriesNew;
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
        return "GuessNumberGame with min number as. "+minNum+" max number as. "+maxNum+" max number of tries as. "+maxTries;
    }

    public static void testConstructors() {
        GuessNumberGameVer1 gng1 = new GuessNumberGameVer1();
        GuessNumberGameVer1 gng2 = new GuessNumberGameVer1(5,10);
        GuessNumberGameVer1 gng3 = new GuessNumberGameVer1(10, 20 ,5);
        System.out.println(gng1);
        gng1.playGame();
        System.out.println(gng2);
        gng2.playGame();
        System.out.println(gng3);
        gng3.playGame();
    }

    public static void TestGuessNumberGenerator() {
        testConstructors();
    }

    public  static void testSetterGetterMethods() {
        GuessNumberGameVer1 gng = new GuessNumberGameVer1();
        System.out.println("The first number game is");
        System.out.println(gng);
        System.out.println("Now, the number of game is " + GuessNumberGameVer1.getNumOfGames());
        GuessNumberGameVer1 gng2 = new GuessNumberGameVer1(5,20);
        System.out.println("Creating another guesses number game");
        System.out.println("Now, the number of game is " + GuessNumberGameVer1.getNumOfGames());

        gng.setMinNum(2);
        gng.setMaxNum(5);
        gng.setMaxTries(2);
        System.out.println("GuessNumberGame with new setting");
        System.out.println(gng);
        System.out.println("GuessNumberGame with getting methods");
        System.out.println("Min num is "+gng.getMinNum()+", max num is "+gng.getMaxNum()
                +", and max tries is "+gng.getMaxTries());

    }

    public static void main(String[] args) {
        //testConstructors();
        testSetterGetterMethods();
    }
}