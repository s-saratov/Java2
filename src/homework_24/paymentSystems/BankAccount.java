package homework_24.paymentSystems;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BankAccount implements PaymentSystem {

    // Поля

    private static int counter; // счётчик
    private final int accountNumber;  // номер счёта
    private BigDecimal balance; // баланс
    private String currency;    // валюта

    // Закрытый конструктор

    protected BankAccount(BigDecimal balance, String currency) {
        this.balance = balance;
        this.currency = currency;
        this.accountNumber = ++counter;
    }

    // Геттеры

    public int getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }

    // Методы

    // 1. Снятие денег со счёта

    @Override
    public void withdrawMoney(double amount) {
        if (amount > 0 && balance.compareTo(convertToBigDecimal(amount)) > 0) {
            BigDecimal withdrawSum = convertToBigDecimal(amount);
            balance = balance.subtract(withdrawSum);
        }
    }

    // 2. Поступление денег на счёт

    @Override
    public void depositTransfer(double amount) {
        if (amount > 0) {
            BigDecimal depositSum = convertToBigDecimal(amount);
            balance = balance.add(depositSum);
        }

    }

    // 3. Перевод денег на другой счёт

    @Override
    public void transferMoney(double amount, BankAccount recipient) {
        if (amount > 0 && balance.compareTo(convertToBigDecimal(amount)) > 0) {
            this.withdrawMoney(amount);

            BigDecimal transferAmount = toUSD(this, convertToBigDecimal(amount));

            if (recipient.currency.equals("EUR")) {
                recipient.balance = recipient.balance.add(toUER(transferAmount).setScale(2));
            }
            if (recipient.currency.equals("INR")) {
                recipient.balance = recipient.balance.add(toINR(transferAmount)).setScale(2);
            }
            if (recipient.currency.equals("CNY")) {
                recipient.balance = recipient.balance.add(toCNY(transferAmount).setScale(2));
            }
            else recipient.balance.add(transferAmount);

        }
        else if (amount < 0) System.out.println("Перевод невозможен. Сумма перевода отрицательная");

        else if (balance.compareTo(convertToBigDecimal(amount)) < 0) {
            System.out.println("Перевод невозможен. На счёте недостаточно средств.");
        }

    }

    // 4. Проверка баланса

    @Override
    public void checkBalance() {
        System.out.println("Остаток по счёту № " + accountNumber + " составляет: " + balance + " " + currency);
    }

    // 5. Создание счёта

    protected static BankAccount createAccount(double amount, String currency) {
        if (amount > 0 && isValidCurrency(currency)) {
            return new BankAccount(BigDecimal.valueOf(amount).setScale(2, RoundingMode.HALF_UP), currency);
        }
        return null;
    }

    // 6. Проверка правильности ввода валюты (вспомогательный)

    protected static boolean isValidCurrency(String currency) {
        for (int i = 0; i < Currencies.currencies.length; i++) {
            if (currency.equalsIgnoreCase(Currencies.currencies[i])) {
                return true;
            }
        }
        return false;
    }

    // 7. Пересчёт из любой валюты в доллары США (вспомогательный)

    private BigDecimal toUSD (BankAccount bankAccount, BigDecimal amount) {
        if (bankAccount.currency.equals("EUR")) {
            return amount.divide(convertToBigDecimal(Currencies.getEURtoUSD()), 2, RoundingMode.HALF_UP);
        }
        if (bankAccount.currency.equals("INR")) {
            return amount.divide(convertToBigDecimal(Currencies.getINRtoUSD()), 2, RoundingMode.HALF_UP);
        }
        if (bankAccount.currency.equals("CNY")) {
            return amount.divide(convertToBigDecimal(Currencies.getINRtoUSD()), 2, RoundingMode.HALF_UP);
        }
        return bankAccount.balance;
    }

    // 8. Пересчёт из долларов США в евро (вспомогательный)

    private BigDecimal toUER (BigDecimal amount) {
        return amount.multiply((BigDecimal.valueOf(Currencies.getEURtoUSD())).setScale(2, RoundingMode.HALF_UP));
    }

    // 9. Пересчёт из долларов США в индийские рупии (вспомогательный)

    private BigDecimal toINR (BigDecimal amount) {
        return amount.multiply((BigDecimal.valueOf(Currencies.getINRtoUSD())).setScale(2, RoundingMode.HALF_UP));
    }

    // 10. Пересчёт из долларов США в юани (вспомогательный)

    private BigDecimal toCNY (BigDecimal amount) {
        return amount.multiply((BigDecimal.valueOf(Currencies.getCNYtoUSD())).setScale(2, RoundingMode.HALF_UP));
    }

    // 11. Конвертация типа double в bigDecimal (вспомогательный)

    private BigDecimal convertToBigDecimal(double value) {
        return new BigDecimal(String.valueOf(value)).setScale(2, RoundingMode.HALF_UP);
    }

}