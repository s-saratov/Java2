package homework_21.components;

public class Storage extends Component {

    private String type;    // тип
    private int size;       // ёмкость

    // Конструктор

    public Storage(String brand, String model, String type, int size) {
        super(brand, model);
        this.type = type;
        this.size = size;
    }

    // Геттеры и сеттеры

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }

    // Метод, возвращающий строковое представление экземпляра класса

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        sb.append(this.getBrand()).append(" ").append(this.getModel());
        sb.append(", тип: ").append(type).append("");
        sb.append(", объём: ").append(size).append(" Гб");
        sb.append("}");

        return sb.toString();
    }

}