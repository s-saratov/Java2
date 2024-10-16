package lesson_25;

// T - type, E - element, K - key, V - value

public class GenericBoxTest<T> {
    private int value;

    public GenericBoxTest(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "GenericBox{" +
                "value = " + value +
                "}";
    }
}