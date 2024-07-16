package homework_42;
/*
@date 12.07.2024
@author Sergey Bugaienko
*/

/*
Task 2 Средний
Дан список транзакций (Transaction) с полями amount,
type (DEBIT/CREDIT),
timestamp.

Используя Stream API, вычислите общую сумму для дебетовых и кредитных транзакций отдельно,
а также найдите транзакцию с максимальной суммой.
 */

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Task2 {
    enum TransactionType {DEBIT, CREDIT}

    static  class Transaction {
        private double amount;
        private TransactionType type;
        private LocalDateTime timestamp;

        public Transaction(double amount, TransactionType type) {
            this.amount = amount;
            this.type = type;
            this.timestamp = LocalDateTime.now();
        }

        @Override
        public String toString() {
            return "Transaction: {" +
                    amount +
                    " : " + type + '}';
        }

        public double getAmount() {
            return amount;
        }

        public TransactionType getType() {
            return type;
        }
    }

    public static void main(String[] args) {
        List<Transaction> transactions = new ArrayList<>(List.of(
                new Transaction(2000, TransactionType.DEBIT),
                new Transaction(2100, TransactionType.CREDIT),
                new Transaction(2500, TransactionType.CREDIT),
                new Transaction(5000, TransactionType.DEBIT),
                new Transaction(3000, TransactionType.CREDIT),
                new Transaction(20_000, TransactionType.DEBIT),
                new Transaction(15_000, TransactionType.CREDIT)
        ));

        double sumDebit = transactions.stream()
                .filter(tr -> tr.getType() == TransactionType.DEBIT)
                .map(Transaction::getAmount)
                .reduce(Double::sum)
                .orElse(0.0);

        double sumCredit = transactions.stream()
                .filter(tr -> tr.getType() == TransactionType.CREDIT)
                .mapToDouble(Transaction::getAmount)
                .sum();


        Optional<Transaction> transactionMax = transactions.stream()
                .max(Comparator.comparingDouble(Transaction::getAmount));
//                .max(Comparator.comparingDouble(tr -> tr.getAmount()))


        System.out.println("Сумма всех Debit транзакций: "+ sumDebit);
        System.out.println("Сумма всех Credit транзакций: "+ sumCredit);
        System.out.println("Транзакция с максимальной суммой " +
                (transactionMax.isPresent() ? transactionMax.get() : "не найдена"));

    }

}
