package homework_27_old;

public class SeasonsMain {

    public static void main(String[] args) {

        System.out.println("The average temperature in Baden-Württemberg is (depending on the season):");

        for (Season season : Season.values()) {
            System.out.printf("%s: from %d°С to %d°С\n", season, season.getMinAvTemp(), season.getMaxAvTemp());
        }

    }

}