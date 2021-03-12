package harinsalai.ratchanon.lab7;

import java.util.Comparator;

public class SortByMaxTries implements Comparator<GuessNumberGameVer4> {
    @Override
    public int compare(GuessNumberGameVer4 maxTriesA, GuessNumberGameVer4 maxTriesB) {
        return maxTriesB.getMaxTries()-(maxTriesA.getMaxTries());
    }
}
