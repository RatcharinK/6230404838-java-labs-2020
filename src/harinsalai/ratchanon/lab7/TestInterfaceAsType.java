package harinsalai.ratchanon.lab7;

import harinsalai.ratchanon.lab6.DiceGame;
import harinsalai.ratchanon.lab6.HighLowGame;
import harinsalai.ratchanon.lab6.MonopolyGame;
import harinsalai.ratchanon.lab6.UseDice;
import java.util.ArrayList;

public class TestInterfaceAsType {
    public static int compareRollDice(DiceGame g1, DiceGame g2) {
        int compareAnswer = Integer.compare(g1.getDiceRoll(),g2.getDiceRoll());
        return compareAnswer;
    }

    public static void main(String[] args) {
        ArrayList<UseDice> games = new ArrayList<UseDice>();
        games.add(new HighLowGame());
        games.add(new HighLowGame(3));
        games.add(new HighLowGame(4, "h"));
        games.add(new MonopolyGame());
        games.add(new MonopolyGame(3));

        for (int i = 1; i < games.size(); i++) {
            String answerText = "";
            int answer = compareRollDice((DiceGame) games.get(i-1),(DiceGame) games.get(i));
            if (answer == -1) {
                answerText = "has dice roll less than to";
            }

            else if (answer == 0) {
                answerText = "has dice roll equal to";
            }

            else if (answer == 1) {
                answerText = "has dice roll greater than to";
            }

            System.out.println("Game("+(i-1)+") : " + ((DiceGame) games.get(i-1)).getDiceRoll() + " " +
                    answerText + " Game("+(i)+") : " + ((DiceGame) games.get(i)).getDiceRoll() );
            System.out.println("Game("+(i-1)+") : rollDice method returns " + games.get(i-1).rollDice());
        }
    }
}
