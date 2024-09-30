package homework_15;

public class ProgrammingLanguage {

    String name;        // Название языка программирования
    String paradigm;    // Парадигма (ООП, функциональная и т.п.)
    int releaseYear;    // Год появления
    boolean isCompiled; // Компилируемый или интерпретируемый


    // Если используется "пустой" конструктор, в параметры объекта класса заполняются данными о языке Java
    public ProgrammingLanguage() {
        this.name = "Java";
        this.paradigm = "объектно-ориентированный";
        this.releaseYear = 1995;
        this.isCompiled = true;
    }

    public ProgrammingLanguage(String name, String paradigm, int releaseYear, boolean isCompiled) {
        this.name = name;
        this.paradigm = paradigm;
        this.releaseYear = releaseYear;
        this.isCompiled = isCompiled;
    }

    public void getInfo() {
        System.out.println("Информация о языке программирования:");
        System.out.println("\t- название: " + name);
        System.out.println("\t- парадигма: " + paradigm);
        System.out.println("\t- год появления: " + releaseYear);
        System.out.println((isCompiled) ? "\t- компилируемый" : "\t- интерпретируемый");
    }

    public void compareAge (ProgrammingLanguage progLang1, ProgrammingLanguage progLang2) {
        if (progLang1.releaseYear > progLang2.releaseYear) System.out.printf("Язык %s старше языка %s.\n", progLang2.name, progLang1.name);
        else if (progLang1.releaseYear == progLang2.releaseYear) System.out.printf("Языки %s и %s - ровесники.\n", progLang1.name, progLang2.name);
        else System.out.printf("Язык %s старше языка %s.\n", progLang1.name, progLang2.name);
    }

}