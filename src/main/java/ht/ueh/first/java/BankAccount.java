package ht.ueh.first.java;

public class BankAccount {
    private int accountNumber;
    private double balance;

    // Constructeur
    public BankAccount(int accountNumber, double balance ){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
          // Methode de la Banque
       public void deposit (double amount) {
           balance += amount;
       }

    public void withdraw (double amount) {
            balance -= amount;
       }

     public double getBalance() {
         return balance;
    }
}
