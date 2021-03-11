package harinsalai.ratchanon.lab7;

import java.util.Comparator;

public class SortByMaxTriesThenRandomRange implements Comparator<GuessNumberGameVer4> {
    @Override
    public int compare(GuessNumberGameVer4 maxTriesA, GuessNumberGameVer4 maxTriesB) {
        int maxTriesCompare = maxTriesB.getMaxTries()-(maxTriesA.getMaxTries());
        return maxTriesCompare == 0 ? maxTriesA.getMaxNum() - maxTriesB.getMaxNum() : maxTriesCompare;
    }
}
