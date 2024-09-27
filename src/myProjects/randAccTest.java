package myProjects;

import java.util.Random;

public class randAccTest {

    public static void main(String[] args) {

        int d1 = 0;
        int d2 = 0;
        int d3 = 0;
        int d4 = 0;
        int d5 = 0;
        int d6 = 0;
        int d7 = 0;
        int d8 = 0;
        int d9 = 0;
        int d10 = 0;
        int sum = 0;

        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int randNum = random.nextInt(100) + 1;
            System.out.println(randNum);
            if((randNum >= 1) & (randNum <= 10)) d1++;
            if((randNum >= 11) & (randNum <= 20)) d2++;
            if((randNum >= 21) & (randNum <= 30)) d3++;
            if((randNum >= 31) & (randNum <= 40)) d4++;
            if((randNum >= 41) & (randNum <= 50)) d5++;
            if((randNum >= 51) & (randNum <= 60)) d6++;
            if((randNum >= 61) & (randNum <= 70)) d7++;
            if((randNum >= 71) & (randNum <= 80)) d8++;
            if((randNum >= 81) & (randNum <= 90)) d9++;
            if((randNum >= 91) & (randNum <= 100)) d10++;
            sum++;
        }

        System.out.println("\nИтого сгенерировано случайных чисел: " + sum + ", из них:");
        System.out.println("\t- от 1 до 10 -\t\t" + d1 + " или " + (float) d1 / sum * 100.0 + "%");
        System.out.println("\t- от 11 до 20 -\t\t" + d2 + " или " + (float) d2 / sum * 100.0 + "%");
        System.out.println("\t- от 21 до 30 -\t\t" + d3 + " или " + (float) d3 / sum * 100.0 + "%");
        System.out.println("\t- от 31 до 40 -\t\t" + d4 + " или " + (float) d4 / sum * 100.0 + "%");
        System.out.println("\t- от 41 до 50 -\t\t" + d5 + " или " + (float) d5 / sum * 100.0 + "%");
        System.out.println("\t- от 51 до 60 -\t\t" + d6 + " или " + (float) d6 / sum * 100.0 + "%");
        System.out.println("\t- от 61 до 70 -\t\t" + d7 + " или " + (float) d7 / sum * 100.0 + "%");
        System.out.println("\t- от 71 до 80 -\t\t" + d8 + " или " + (float) d8 / sum * 100.0 + "%");
        System.out.println("\t- от 81 до 90 -\t\t" + d9 + " или " + (float) d9 / sum * 100.0 + "%");
        System.out.println("\t- от 91 до 100 -\t" + d10 + " или " + (float) d10 / sum * 100.0 + "%");

    }

}