package homework_27_old;

/*
Task 1

Реализуйте Enum для определения четырех времен года с методами,
возвращающими среднюю температуру для каждого времени года.
 */

public enum Season {
    WINTER (-2, 4),
    SPRING (5, 15),
    SUMMER (15, 25),
    AUTUMN (7, 15);

    private final int minAvTemp;
    private final int maxAvTemp;

    Season(int minAvTemp, int maxAvTemp) {
        this.minAvTemp = minAvTemp;
        this.maxAvTemp = maxAvTemp;
    }

    public int getMaxAvTemp() {
        return maxAvTemp;
    }

    public int getMinAvTemp() {
        return minAvTemp;
    }

}