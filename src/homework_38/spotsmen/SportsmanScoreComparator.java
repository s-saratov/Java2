package homework_38.spotsmen;

import java.util.Comparator;

public class SportsmanScoreComparator implements Comparator <Sportsman> {

    @Override
    public int compare(Sportsman sportsman1, Sportsman sportsman2) {
        return sportsman1.getScore() - sportsman2.getScore();
    }
}