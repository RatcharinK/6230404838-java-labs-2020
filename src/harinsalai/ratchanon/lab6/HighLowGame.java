package harinsalai.ratchanon.lab6;

import java.util.Random;

public class HighLowGame extends DiceGame implements HasRule, UseDice {
    protected int numOfDice;
    public int summation;

    //getter and setter of NumOfDice
    public int getNumOfDice() {
        return numOfDice;
    }
    public void setNumOfDice(int numOfDice) {
        this.numOfDice = numOfDice;
    }

    public HighLowGame() {
        this.numOfDice = 3;
        this.answer = getAnswer();
        this.numOfPlayers = 1;
        this.diceRoll = rollDice();
    }

    public HighLowGame(int numOfDice) {
        this.numOfDice = numOfDice;
        this.answer = getAnswer();
        this.numOfPlayers = 1;
        this.diceRoll = rollDice();
    }

    public HighLowGame(int numOfDice ,String answer) {
        this.numOfDice = numOfDice;
        this.answer = answer;
        this.numOfPlayers = 1;
        this.diceRoll = rollDice();
    }

    @Override
    public String gameRule() {
        return null;
    }

    @Override
    public int rollDice() {
        for (int i =0; i < numOfDice; i++) {
            Random number = new Random();
            int upperbound = 5;
            int randomNumber = 1 + (number.nextInt(upperbound));
            summation += randomNumber;
        }
        return summation;
    }

    @Override
    public String toString() {
        return "Game name : High-Low Game, Num of players : " + numOfPlayers + ", Dice roll : "
                + summation +", Player's guess : " + answer + ", Number of dice is " + numOfDice;
    }
    @Override
    public void playGame() {
        //create variable for answer
        String answerLetter = "";
        //create variable for calculate number that divide high and low
        int middleNumber = (numOfDice*6 - numOfDice + 1)/2 + numOfDice - 1;

        if (summation <= middleNumber) {
            answerLetter = "l";
        }
        else if (summation > middleNumber) {
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
