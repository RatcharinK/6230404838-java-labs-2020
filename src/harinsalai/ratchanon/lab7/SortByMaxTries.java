package harinsalai.ratchanon.lab7;

import java.util.Comparator;

public class SortByMaxTries implements Comparator<GuessNumberGameVer4> {
    @Override
    public int compare(GuessNumberGameVer4 game1, GuessNumberGameVer4 game2) {
        return game2.getMaxTries() - (game1.getMaxTries());
    }
}
