package homework_21.autobuses;

public class BusDriver {

    // Поля

    private static int idCounter = 1;   // cчётчик идентификационных номеров
    private final int id;               // идентификационный номер
    private String name;                // имя
    private String licenseNumber;       // номер лицензии

    // Конструктор

    public BusDriver(String name, String licenseNumber) {
        this.id = idCounter++;
        this.name = name;
        this.licenseNumber = licenseNumber;
    }

    // Геттеры и сеттеры

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    // Метод, возвращающий строковое представление экземпляра класса

    public String toString() {
        StringBuilder sb = new StringBuilder("BusDriver: {");
        sb.append("id: ").append(id);
        sb.append(", name: ").append(name);
        sb.append("}");

        return sb.toString();
    }
}