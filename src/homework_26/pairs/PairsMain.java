package homework_26.pairs;

public class PairsMain {

    public static void main(String[] args) {

        Pair<String> pair = new Pair<>("Hello", "World");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

        pair.swap();
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

        pair.setFirst("Ja");
        pair.setSecond("va");
        System.out.println(pair.getFirst() + pair.getSecond());

    }

}