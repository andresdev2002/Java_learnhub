//Create a BankAccount class with a private balance and methods to deposit and withdraw money.
package org.example;

public class BankAccount2 {
    double balance;

    public BankAccount2(double InitialBalance){
        this.balance = InitialBalance;

        }

    public void deposit(double amount){
        balance += amount;

    }

    public void withDraw(double amount){
        if (amount <= balance){
            balance -= amount;
        }else {
            System.out.println("Insufficient funds");
        }
    }

    public double getBalance(){
        return balance;
    }

    public static void main(String[] args){

        BankAccount2 account = new BankAccount2(1000000);
        account.deposit(500000);
        account.withDraw(400000);
        System.out.println("Final balance: " + account.getBalance());
    }

}
