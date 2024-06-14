package homework_22.systems2;
/*
@date 14.06.2024
@author Sergey Bugaienko
*/

public class BankAccount extends VusaMember implements PaymentSystem {

    private String title;
    private double balance;

    public BankAccount(String title, double balance) {
        super("EUR");
        this.title = title;
        this.balance = balance;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "title='" + title + '\'' +
                ", balance=" + balance + " " + this.getCurrency() +
                '}';
    }

    @Override
    public boolean transferMoney(double amountEur, PaymentSystem recipient) {
        if (amountEur > balance) {
            System.out.printf("Недостаточно средств: (transfer: %.2f | balance: %.2f)\n", amountEur, balance);
            return false;
        }

        if (recipient.getCurrency().equals("EUR")) {
            //перевод на евровый счет
            balance -= amountEur;
            recipient.depositTransfer(amountEur);
            System.out.printf("Успех! Перевод %.2f EUR (%s) -> %s\n", amountEur, title, recipient.getTitle());
            return true;

        } else if (recipient.getCurrency().equals("BTC")) {
            // Конвертировать EUR в BTC

            double amountBtc = amountEur / getCourseBTC();
            balance -= amountEur;
            recipient.depositTransfer(amountBtc);

             return true;
        }

        System.out.println("Что-то пошло не так с получателем перевода");
        return false;


    }

    @Override
    public boolean withdrawMoney(double amount) {
        if (amount > balance) {
            System.out.println("Недостаточно средств для вывода: " + amount);
            return false;
        }

        balance -= amount;
        System.out.println("Успешно снято со счета " + amount + " " + this.getCurrency() + " (Банк: " + title + ")");
        return true;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    //Поступление на счет
    @Override
    public void depositTransfer(double amount) {
        this.balance += amount;
    }
}
