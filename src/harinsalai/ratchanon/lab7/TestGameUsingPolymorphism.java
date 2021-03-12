package harinsalai.ratchanon.lab7;

import harinsalai.ratchanon.lab6.DiceGame;
import harinsalai.ratchanon.lab6.Game;
import harinsalai.ratchanon.lab6.GuessNumberGame;

import java.util.ArrayList;

public abstract class TestGameUsingPolymorphism extends Game {
    static ArrayList<Game> game =
            new ArrayList<Game>(0);

    public static void main(String[] args) {
        game.add(new DiceGame());
        game.add(new DiceGame("h"));
        game.add(new GuessNumberGame());
        game.add(new DiceGame("l"));
        game.add(new GuessNumberGame(1, 6, 1));
        for (Game game : game) {
            System.out.println(game);
            game.playGame();
        }
    }
}