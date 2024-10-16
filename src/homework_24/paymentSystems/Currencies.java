package homework_24.paymentSystems;

public class Currencies {

    // Поля

    public static final String[] currencies = {"USD", "EUR", "INR", "CNY"}; // список поддерживаемых валют

    private static double EURtoUSD; // курс евро к доллару США
    private static double INRtoUSD; // курс индийского рупия к доллару США
    private static double CNYtoUSD; // курс юаня к доллару США

    // Геттеры и сеттеры

    public static double getEURtoUSD() {
        return EURtoUSD;
    }
    protected static void setEURtoUSD(double newEURtoUSD) {
        EURtoUSD = newEURtoUSD;
    }

    public static double getINRtoUSD() {
        return INRtoUSD;
    }
    protected static void setINRtoUSD(double newINRtoUSD) {
        INRtoUSD = newINRtoUSD;
    }

    public static double getCNYtoUSD() {
        return CNYtoUSD;
    }
    protected static void setCNYtoUSD(double newCNYtoUSD) {
        CNYtoUSD = newCNYtoUSD;
    }
}