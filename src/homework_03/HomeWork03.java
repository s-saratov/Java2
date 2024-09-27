package homework_03;

public class HomeWork03 {

    public static void main(String[] args) {

        // Task 1

        int myAge = 36;
        double milkPrice = 1.29;
        String myName = "Sergej";

        System.out.println("Ich bin " + myAge + " Jahre alt");
        System.out.println("Die Milch kostet " + milkPrice + " Euro");
        System.out.println("Ich heiße " + myName + "\n");

        // Task 2

        int var0 = 0;
        int var1 = 1;
        int var2 = 2;
        int var3 = 3;
        int sum = (var0 + var1 + var2 + var3) / 4;
        double sumDouble = (var0 + var1 + var2 + var3) / 4.0;
        System.out.println("Das arithmetische Mittel ist " + sum);
        System.out.println("Verworfener Bruchteil ist " + (sumDouble - sum) + "\n");

        // Task 3

        double aPrice = 100.00;
        double bPrice = 500.00;
        int discount = 10;
        double discountedSum = ((aPrice + bPrice) / 100.00) * (100.00 - discount);
        System.out.println("Die Gesamtkosten für den Rabatt betragen " + discountedSum + " Euro");
        System.out.println("Der Gesamte Rabatt beträgt " + ((aPrice + bPrice) - discountedSum) + " Euro\n");

        // Task 4

        double temp05Sept = 28.8;
        double temp06Sept = 23.3;
        double temp07Sept = 27.2;
        double temp08Sept = 21.5;
        double temp09Sept = 15.0;
        double temp10Sept = 16.4;
        double temp11Sept = 13.1;

        System.out.println("Höchsttemperaturen in der Gemeinde Weissach im Tal in den vergangenen sieben Tagen:");
        System.out.println("05. September - " + temp05Sept + " Grad");
        System.out.println("06. September - " + temp06Sept + " Grad");
        System.out.println("07. September - " + temp07Sept + " Grad");
        System.out.println("08. September - " + temp08Sept + " Grad");
        System.out.println("09. September - " + temp09Sept + " Grad");
        System.out.println("10. September - " + temp10Sept + " Grad");
        System.out.println("11. September - " + temp11Sept + " Grad\n");
        System.out.println("Die durchschnittliche Temperatur in sieben Tagen beträgt " + (temp05Sept + temp06Sept + temp07Sept + temp08Sept + temp09Sept + temp10Sept + temp11Sept) / 7 + " Grad\n");

        // Task 5

        System.out.println("Mögliche Reste aus der Division durch 2: 0 oder 1");
        System.out.println("Mögliche Reste aus der Division durch 3: 0, 1 oder 2");

    }

}
