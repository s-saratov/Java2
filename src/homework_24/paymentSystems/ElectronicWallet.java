package homework_24.paymentSystems;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ElectronicWallet extends BankAccount {

    // Закрытый конструктор

    private ElectronicWallet(BigDecimal balance, String currency) {
        super(balance, currency);
    }

    // Методы

    // 1. Проверка баланса (переопределённый)

    @Override
    public void checkBalance() {
        System.out.println("Остаток по электронному кошельку № " + getAccountNumber() + " составляет: "
                + getBalance() + " " + getCurrency());
    }

    // 2. Создание электронного кошелька (переопределённый)

    protected static ElectronicWallet createAccount(double amount, String currency) {
        if (amount > 0 && isValidCurrency(currency)) {
            return new ElectronicWallet(BigDecimal.valueOf(amount).setScale(2, RoundingMode.HALF_UP), currency);
        }
        return null;
    }

}