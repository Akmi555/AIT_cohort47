package homework_22.systems2;
/*
@date 14.06.2024
@author Sergey Bugaienko
*/

public class ElectronicWallet extends VusaMember implements PaymentSystem {

    private String walletTitle;
    private double balance;

    public ElectronicWallet(String walletTitle, double balance) {
        super("BTC");
        this.walletTitle = walletTitle;
        this.balance = balance;
    }

    @Override
    public boolean transferMoney(double amountBtc, PaymentSystem recipient) {
        if (amountBtc > balance) {
            System.out.printf("Недостаточно средств: (transfer: %.2f | balance: %.2f)\n", amountBtc, balance);
            return false;
        }

        if (recipient.getCurrency().equals("BTC")) {
            balance -= amountBtc;
            recipient.depositTransfer(amountBtc);
            System.out.printf("Успех! Перевод %.2f BTC (%s) -> %s\n", amountBtc, walletTitle, recipient.getTitle());
            return true;
        } else if (recipient.getCurrency().equals("EUR")) {
            //Конвертировать BTC to EUR
            double amountEur = amountBtc * getCourseBTC();
            balance -= amountBtc;
            recipient.depositTransfer(amountEur);
            System.out.printf("Успех! Перевод %.2f BTC (%s) -> %.2f EUR (%s)\n", amountBtc, walletTitle, amountEur, recipient.getTitle());
            return true;
        }

        System.out.println("Что-то не так с валютой счета получателя");
        return false;
    }

    @Override
    public boolean withdrawMoney(double amount) {
        if (amount > balance) {
            System.out.println("Недостаточно средств для вывода: " + amount);
            return false;
        }

        balance -= amount;
        System.out.println("Успешно снято со счета " + amount + " BTC");
        return true;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public void depositTransfer(double amount) {
        balance += amount;
    }

    @Override
    public String getTitle() {
        return walletTitle;
    }

    @Override
    public String toString() {
        return "ElectronicWallet{" +
                "walletTitle='" + walletTitle + '\'' +
                ", balance=" + String.format("%.5f", balance) +
                '}';
    }
}
