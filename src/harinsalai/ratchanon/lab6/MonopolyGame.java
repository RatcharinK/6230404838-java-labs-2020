package harinsalai.ratchanon.lab6;

public class MonopolyGame extends DiceGame implements HasRule, UseDice, UseBoard {
    protected int[] cash;
    protected int numOfDice = 2;

    //getter and setter of Cash
    public int[] getCash() {
        return cash;
    }
    public void setCash(int[] cash) {
        this.cash = cash;
    }

    public MonopolyGame() {
        this.numOfPlayers = 2;
        cash = new int[numOfPlayers];
        for (int i =0; i < numOfPlayers; i++) {
            cash[i] = 1500;
        }
    }

    public MonopolyGame(int numOfPlayers) {
        this.numOfPlayers = numOfPlayers;
        cash = new int[numOfPlayers];
        for (int i =0; i < numOfPlayers; i++) {
            cash[i] = 1500;
        }
    }

    @Override
    public void playGame() {
        System.out.println("Playing Monopoly Game");
    }

    @Override
    public String toString() {
        return "Game name : Monopoly Game, Num of players : " + numOfPlayers;
    }

    @Override
    public String gameRule() {
        return null;
    }

    @Override
    public void setUpBord() {
        System.out.println("Setting up monopoly board");
    }

    @Override
    public int rollDice() {
        return (numOfDice*6 - numOfDice + 1)/2 + numOfDice - 1;
    }
}
