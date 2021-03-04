package harinsalai.ratchanon.lab6;

public abstract class Game {
    protected String gameName;
    protected int numOfPlayers = 0;

    //getter and setter of name
    public String getGameName() {
        return gameName;
    }
    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    //getter and setter of num of player
    public int getNumOfPlayers() {
        return numOfPlayers;
    }
    public void setNumOfPlayers(int numOfPlayers) {
        this.numOfPlayers = numOfPlayers;
    }

    public Game() {
        this.gameName = "unknown game";
        this.numOfPlayers = 0;
    }

    public Game(String gameName, int numOfPlayers) {
        this.gameName = gameName;
        this.numOfPlayers = numOfPlayers;
    }

    @Override
    public String toString() {
        return "Game name : " + gameName + ", Num of players : " + numOfPlayers;
    }

    public abstract void playGame();

}