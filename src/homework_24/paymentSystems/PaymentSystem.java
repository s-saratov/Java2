package homework_24.paymentSystems;

/*
Task 2
Платёжные системы

Создайте интерфейс PaymentSystem с методами:
    - withdrawMoney(double amount) (снятие со счета) - списываются деньги со счета;
    - depositTransfer(double amount) (поступление денег на счет);
    - checkBalance() (остаток на счете).

Напишите классы BankAccount и ElectronicWallet, которые реализуют данный интерфейс.

Банк предоставляет счета, например, в евро, а электронный кошелек в другой валюте.

Убедитесь, что каждый класс корректно выполняет каждую из операций.

Добавить в интерфейс метод transferMoney() (перевод средств на другой счет) -
Средства списываются с одного счета и зачисляются на другой счёт.

Должна быть возможность осуществлять переводы между этими классами, т.е. возможность перевода средств:
    - Банк -> Банк
    - Банк -> Кошелек
    - Кошелек -> Кошелек
    - Кошелек -> Банк
 */

public interface PaymentSystem {

    // Методы

    void withdrawMoney(double amount);                      // снятие со счёта
    void depositTransfer(double amount);                    // поступление на счёт
    void transferMoney(double amount, BankAccount recipient);   // перевод на другой счёт
    void checkBalance();                                    // остаток на счёте


}