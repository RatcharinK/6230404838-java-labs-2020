package harinsalai.ratchanon.lab7;

import java.util.Comparator;

public class SortByMaxTriesThenRandomRange implements Comparator<GuessNumberGameVer4> {
    @Override
    public int compare(GuessNumberGameVer4 game1, GuessNumberGameVer4 game2) {
        int maxTriesCompare = game2.getMaxTries()-(game1.getMaxTries());
        return maxTriesCompare == 0 ? (game1.getMaxNum() - game1.getMinNum()) -
                (game2.getMaxNum() - game2.getMinNum()) : maxTriesCompare;
    }
}
