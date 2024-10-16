package homework_24.paymentSystems;

public class PaymentApp {

    public static void main(String[] args) {

        // Устанавливаем текущие курсы валют

        Currencies.setEURtoUSD(1.05);
        Currencies.setINRtoUSD(83.25);
        Currencies.setCNYtoUSD(7.12);

        // Создаём банковский счёт с остатком 1000 евро

        BankAccount bankAccount = BankAccount.createAccount(1000.00, "EUR");

        // Выводим на экран баланс

        bankAccount.checkBalance();

        // Снимаем со счёта 100 евро и выводим на экран баланс

        bankAccount.withdrawMoney(100.00);
        bankAccount.checkBalance();

        // Вносим на счёт 300 долларов США и выводим на экран баланс

        bankAccount.depositTransfer(300.00);
        bankAccount.checkBalance();

        // Создаём электронный кошелёк с остатком 300 индийский рупий

        ElectronicWallet electronicWallet = ElectronicWallet.createAccount(300.00, "INR");

        // Выводим на экран баланс электронного кошелька

        electronicWallet.checkBalance();

        // Переводим 100 евро со счёта на электронный кошелёк

        bankAccount.transferMoney(100.00, electronicWallet);

        // Выводим итоговые балансы

        bankAccount.checkBalance();
        electronicWallet.checkBalance();

    }

}