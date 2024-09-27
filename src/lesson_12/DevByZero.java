package lesson_12;

public class DevByZero {

    public static void main(String[] args) {

//        int a = 100;
//        int b = 0;
//        int c = a / 0;
//        System.out.println(c);

        double d1 = 100;
        double d2 = 0;
        double c1 = d1 / d2;
        double c2 = 5000 / d2;

        System.out.println("c1 = (100 / 0) = " + c1);
        System.out.println("c2 = (5000 / 0) = " + c1);

        double test = c1 - c2;
        System.out.println("c1 - c2 = " + test);

        System.out.println("c1 == c2: " + (c1 == c2));
        System.out.println("c1 > c2: " + (c1 > c2));

        test = c1 / c2;
        System.out.println("c1 / c2 = " + test);

        test = c1 * c2;
        System.out.println("c1 * c2 = " + test);

        test = c1 + c2;
        System.out.println("c1 + c2 = " + test);

        test = c1 * -1;
        System.out.println("c1 * -1 = " + test);

    }
}