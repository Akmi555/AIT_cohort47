package homework_22.systems1;
/*
@date 14.06.2024
@author Sergey Bugaienko
*/

/*
Платежные системы

Создайте интерфейс PaymentSystem с методами
transferMoney() (перевод средств на другой счет),
withdrawMoney() (снятие со счета) и
checkBalance() (остаток на счете).

Реализуйте классы BankAccount и ElectronicWallet, которые реализуют данный интерфейс.
Убедитесь, что каждый класс корректно выполняет каждую из операций.
 */

public interface PaySystem {
    void transferMoney(double amount);
    void withdrawMoney(double drawMoney);
    double checkBalance();
}
