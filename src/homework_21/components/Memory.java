package homework_21.components;

public class Memory extends Component {

    private String type;    // тип
    private int size;       // объём
    private int frequency;  // частота
    private Computer computer;  // реализация двунаправленной связи с компьютером

    // Конструктор

    public Memory(String brand, String model, String type, int size, int frequency) {
        super(brand, model);
        this.type = type;
        this.size = size;
        this.frequency = frequency;
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

    public int getFrequency() {
        return frequency;
    }
    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public Computer getComputer() {
        return computer;
    }
    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    // Метод, возвращающий строковое представление экземпляра класса

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        sb.append(this.getBrand()).append(" ").append(this.getModel());
        sb.append(", тип: ").append(type);
        sb.append(", объём: ").append(size);
        sb.append(" Гб, частота: ").append(frequency).append(" Мгц");
        sb.append("}");

        return sb.toString();
    }

}