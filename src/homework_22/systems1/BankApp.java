package homework_22.systems1;
/*
@date 14.06.2024
@author Sergey Bugaienko
*/

public class BankApp {
    public static void main(String[] args) {

        BankAcc bank = new BankAcc("Bank1", 10000);
        EWallet wallet = new EWallet("E-Wallet", 5000);

        System.out.println(bank);
        bank.withdrawMoney(500000);
        bank.withdrawMoney(500);
        System.out.println(bank.checkBalance());

        wallet.transferMoney(1500);
        System.out.println(wallet);
    }
}
