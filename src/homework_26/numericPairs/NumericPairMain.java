package homework_26.numericPairs;

public class NumericPairMain {

    public static void main(String[] args) {

        NumericPair<Integer> intPair = new NumericPair<>(10, 20);
        System.out.println(intPair.sum());

        NumericPair<Double> doublePair = new NumericPair<>(5.5, 4.5);
        System.out.println(doublePair.sum());

    }

}