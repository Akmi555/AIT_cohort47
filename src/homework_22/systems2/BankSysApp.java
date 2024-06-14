package homework_22.systems2;
/*
@date 14.06.2024
@author Sergey Bugaienko
*/

public class BankSysApp {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("Cyprus Bank", 50000);

        System.out.println(bankAccount);

        bankAccount.withdrawMoney(1_000_000);
        System.out.println(bankAccount.withdrawMoney(1000));
        System.out.println(bankAccount);

        System.out.println("========= Transfer ==========\n");

        BankAccount bankAccount1 = new BankAccount("A-Bank", 10000);

        bankAccount.transferMoney(14000, bankAccount1);

        System.out.println(bankAccount);
        System.out.println(bankAccount1);

        System.out.println("\n ================== BTC ===============\n");

        ElectronicWallet wallet = new ElectronicWallet("Crypto Wallet", 5);

        System.out.println(wallet);

        wallet.transferMoney(1, bankAccount);
        System.out.println(wallet);
        System.out.println(bankAccount);

        bankAccount1.transferMoney(30000, wallet);
        bankAccount1.transferMoney(24000, wallet);

        System.out.println(bankAccount1);
        System.out.println(wallet);



    }
}
