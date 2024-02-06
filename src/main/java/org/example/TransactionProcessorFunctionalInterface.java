package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;

/*Imagine we have a Transaction class and a list of Transaction objects. We want to:

        Filter transactions that are greater than a certain amount.
        For each filtered transaction, apply some processing.
        Sum the amounts of processed transactions.
        Here is how we could implement this using functional interfaces and lambda expressions:*/
public class TransactionProcessorFunctionalInterface {

        // Transaction class
        public static class Transaction {
            private String id;
            private double amount;

            public Transaction(String id, double amount) {
                this.id = id;
                this.amount = amount;
            }

            // getters and setters
            public String getId() {
                return id;
            }

            public double getAmount() {
                return amount;
            }
        }

        public static void main(String[] args) {
            // List of transactions
            List<Transaction> transactions = Arrays.asList(
                    new Transaction("TXN1", 100.0),
                    new Transaction("TXN2", 1500.0),
                    new Transaction("TXN3", 200.0),
                    new Transaction("TXN4", 3000.0)
            );

            // Predicate to filter high-value transactions
            Predicate<Transaction> isHighValue = txn -> txn.getAmount() > 1000;

            // Function to apply some processing on the transaction amount (e.g., applying tax)
            Function<Transaction, Double> applyTax = txn -> {
                double taxRate = 0.2; // 20% tax
                return txn.getAmount() * (1 - taxRate);
            };

            // Consumer to perform an action with the transaction (e.g., print out the transaction amount)
            Consumer<Transaction> displayTransaction = txn ->
                    System.out.println("Processed transaction with ID: " + txn.getId() + " and amount: " + txn.getAmount());

            // Processing the transactions
            double total = 0.0;
            for (Transaction txn : transactions) {
                if (isHighValue.test(txn)) {
                    double processedAmount = applyTax.apply(txn);
                    txn = new Transaction(txn.getId(), processedAmount); // update the transaction with the processed amount
                    displayTransaction.accept(txn);
                    total += processedAmount;
                }
            }

            System.out.println("Total of processed transactions: " + total);
        }
}
