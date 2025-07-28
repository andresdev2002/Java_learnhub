package org.example;

public class BankAccount {
   String AccountNumber;
   String holderName;
   double balance;

   public BankAccount(String AccountNumber, String holderName, double balance){
      this.AccountNumber = AccountNumber;
      this.holderName = holderName;
      this.balance = balance;
   }

   //Deposit method
    public void deposit(double amount){
      balance += amount;
      System.out.println("Deposited: $" + amount);
    }

    //WithDraw method

   public void withDraw(double amount){
      if(amount <= balance){
         balance -= amount;
         System.out.println("WithDraw: $" + amount);
      }else {

         System.out.println("Insufficient funds");
      }
   }
   //Show Balance
   public void ShowBalance(){
      System.out.println("Current balance: $" + balance);
   }

//Creating account object

   public static void main(String[] args){
      BankAccount MyAccount = new BankAccount("arl234588", "Andres Calderon", 1000000);
      MyAccount.ShowBalance();
      MyAccount.deposit(500000);
      MyAccount.withDraw(250000);
      MyAccount.ShowBalance();

   }
}





