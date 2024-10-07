package lesson_18.staticBlockDemo;

public class InitExample {

    static String[] colors;
    static int counter = 1;

    private String title = "Hello";
    private int capacity = 10;

    // Статический блок инициализации.
    // Он вызывается только один раз, в момент загрузки класса в JVM и инициализации статических полей.

    // Инициализация статических полей - присвоение начальных значений
    static {
        System.out.println("Static init block run!");
        colors = new String[3];
        colors[0] = "red";
        colors[1] = "green";
        colors[2] = "blue";
        counter = 10;
    }

    static {
        System.out.println("Second static init block run!");
        counter = 100;
    }

    // НЕстатический блок инициализации
    // Выполняется ДО конструктора
    {
        System.out.println("Non-static init block run!");
        this.title = "Non-static title!";
    }

    public InitExample() {
        System.out.println("Constructor run!");
        this.title = "Constructor";
    }

    public static void changeColors(String color1, String color2) {
        colors[0] = color1;
        colors[1] = color2;
    }

    public String toString() {
        return "title: " + title + ", capacity: " + capacity + ", static-counter: " + counter;
    }

    public String getTitle() {
        return title;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}