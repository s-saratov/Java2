package homework_21.autobuses;

public class Autopilot {

    // Поля

    private String softwareVersion; // Версия прошивки
    private Autobus autobus;        // связь с автобусом установки

    // Конструктор

    public Autopilot(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    // Геттеры и сеттеры

    public Autobus getAutobus() {
        return autobus;
    }
    public void setAutobus(Autobus autobus) {
        this.autobus = autobus;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }
    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    // Метод, возвращающий строковое представление экземпляра класса

    public String toString() {
        return "Autopilot: {SV: " + softwareVersion + "}";
    }

}