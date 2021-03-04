package harinsalai.ratchanon.lab6;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class DiceGame extends Game{
    protected int diceRoll;
    protected String answer;

    //getter and setter of Answer
    public String getAnswer() {
        return answer;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    //getter  of diceRoll
    public int getDiceRoll() {
        return diceRoll;
    }

    //create scanner
    Scanner scan = new Scanner(System.in);

    //create random number
    Random genNumber = new Random();
    int randomNumber = genNumber.nextInt(6);

    public DiceGame() {
        this.answer = "l";
        this.diceRoll = 1 + randomNumber;
    }

    public DiceGame(String answer) {
        this.answer = answer;
        this.diceRoll = 1 + randomNumber;
    }

    @Override
    public String toString() {
        return "Game name : Dice Game, Num of players : " + numOfPlayers + ", Dice roll : "
                + diceRoll +", Player's guess : " + answer;
    }

    public void playGame() {
        //create variable for answer
        String answerLetter = "";

        if (diceRoll < 3 ) {
            answerLetter = "l";
        }
        else if (diceRoll >= 3 ) {
            answerLetter = "h";
        }

        //check guess and answer
        if (answer.equals(answerLetter)){
            System.out.println("Congratulations. You win.");
        }
        else {
            System.out.println("Sorry. You lose.");
        }
    }
}
