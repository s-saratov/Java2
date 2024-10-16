package homework_24.paymentSystems;

public class PaymentApp {

    public static void main(String[] args) {

        // Устанавливаем текущие курсы валют

        Currencies.setEURtoUSD(1.05);
        Currencies.setINRtoUSD(83.25);
        Currencies.setCNYtoUSD(7.12);

        // Создаём банковский счёт с остатком 1000 долларов США

        BankAccount bankAccount = BankAccount.createAccount(1000.00, "EUR");

        // Выводим на экран баланс

        bankAccount.checkBalance();

        // Снимаем со счёта 100 долларов США и выводим на экран баланс

        bankAccount.withdrawMoney(10.0);
        bankAccount.checkBalance();

        // Вносим на счёт 300 долларов США и выводим на экран баланс

        bankAccount.depositTransfer(300);
        bankAccount.checkBalance();

        // Создаём электронный кошелёк с остатком 300 индийский рупий

        ElectronicWallet electronicWallet = ElectronicWallet.createAccount(300, "INR");

        // Выводим на экран баланс электронного кошелька

        electronicWallet.checkBalance();

        // Переводим 100 долларов со счёта на электронный кошелёк

        bankAccount.transferMoney(50, electronicWallet);

        // Выводим итоговые балансы

        bankAccount.checkBalance();
        electronicWallet.checkBalance();

    }

}