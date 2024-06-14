package homework_22.systems1;
/*
@date 14.06.2024
@author Sergey Bugaienko
*/

public class EWallet implements PaySystem{

    private String title;
    private double balance;

    public EWallet(String title, double balance) {
        this.title = title;
        this.balance = balance;
    }

    @Override
    public void transferMoney(double amount) {
        if (amount > balance) return;
        System.out.println("Электронный кошелек "+ title + ". Перевод " + amount);
        balance -= amount;
    }

    @Override
    public void withdrawMoney(double drawMoney) {
        if (drawMoney > balance) {
            System.out.println("Недостаточно денег на счету для снятия " + drawMoney);
            return;
        }

        System.out.println("Электронный кошелек " + title + ". Вывод средств со счета " + drawMoney);
        balance -= drawMoney;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "EWallet{" +
                "title='" + title + '\'' +
                ", balance=" + balance +
                '}';
    }
}
