package homework_22.systems2;
/*
@date 14.06.2024
@author Sergey Bugaienko
*/

public interface PaymentSystem {
    boolean transferMoney(double amount, PaymentSystem recipient);
    boolean withdrawMoney(double amount);
    double checkBalance();

    void depositTransfer(double amount);
    String getCurrency();
    String getTitle();

}
