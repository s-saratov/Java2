package lesson_15;

public class Cat {

    public String name;
    public String color;
    public int age;

    // Конструктор класса
    // Специальный тип метода. Основная задача - установить начальные значения свойств объекта.

    /*
    1. Имя конструктора совпадает с именем класса.
    2. Конструктор не имеет возвращаемого типа.
    3. Конструктор вызывается автоматически при создании объекта.
     */

    // Конструктор по умолчанию.

    public Cat(){
    }

    // Перегрузка конструктора

    public Cat(String catName) {
        name = catName;
    }

    public Cat(String catName, String color) {
        name = catName;
        this.color = color;
        // Ключевое слово this используется внутри класса для ссылки на текущий объект
        // Оно поможет разрешению конфликта имён между полями класса и параметрами методов / конструктора
    }

    public Cat(String name, String color, int age) {
        this(name, color); // вызов другого конструктора должен быть первой строкой исполняемого кода
        // Вызываю конструктор класса, принимающий две строки
        // Соответствующие поля проинициализированы
        // Ключевое слово this может использоваться для вызова других конструкторов класса
        // или для передачи текущего объекта в качестве параметра метода (разберём позже)

//        this.name = name;
//        this.color = color;
        this.age = age;
    }

    public void sleep() {
        System.out.println("Я сплю!");
    }

    public void run() {
        System.out.println("Я бегу!");
    }

    public void sayMeow() {
        System.out.println("Meow!");
    }

    public void whoAmI() {
        System.out.printf("Я котик %s, мой возраст: %d, мой окрас: %s\n", name, age, color);
    }

}