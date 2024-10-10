package homework_21.components;

public class Processor extends Component {

    // Поля

    private int numCores;       // количество ядер
    private int coreFrequency;  // частота ядра
    private String chipset;     // чипсет
    private Computer computer;  // реализация двунаправленной связи с компьютером

    // Конструктор

    public Processor(String brand, String model, int numCores, int coreFrequency, String chipset) {
        super(brand, model);
        this.numCores = numCores;
        this.coreFrequency = coreFrequency;
        this.chipset = chipset;
    }

    // Геттеры и сеттеры

    public int getNumCores() {
        return numCores;
    }
    public void setNumCores(int numCores) {
        this.numCores = numCores;
    }

    public int getCoreFrequency() {
        return coreFrequency;
    }
    public void setCoreFrequency(int coreFrequency) {
        this.coreFrequency = coreFrequency;
    }

    public String getChipset() {
        return chipset;
    }
    public void setChipset(String chipset) {
        this.chipset = chipset;
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
        sb.append(", количество ядер: ").append(numCores);
        sb.append(", тактовая частота ядра: ").append(coreFrequency);
        sb.append(" ГГц, чипсет: ").append(chipset);
        sb.append("}");

        return sb.toString();
    }

}