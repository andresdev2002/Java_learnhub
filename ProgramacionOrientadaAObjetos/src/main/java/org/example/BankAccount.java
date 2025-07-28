package org.example;
import java.util.Scanner;

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

   //Display Menu
   public void DisplayMenu(){
       Scanner scanner = new Scanner(System.in);
      int option;

      do {
         System.out.println("\n--- My Account Options ---");
         System.out.println("1. Check balance");
         System.out.println("2. Deposit money");
         System.out.println("3. Withdraw money");
         System.out.println("4. Exit");
         System.out.print("Select an option: ");
         option = scanner.nextInt();

         switch (option) {
            case 1:
               ShowBalance();
               break;
            case 2:
               System.out.print("Enter amount to deposit: ");
               double depositAmount = scanner.nextDouble();
               deposit(depositAmount);
               break;
            case 3:
               System.out.print("Enter amount to withdraw: ");
               double withdrawAmount = scanner.nextDouble();
               withDraw(withdrawAmount);
               break;
            case 4:
               System.out.println("Thank you. Exiting...");
               break;
            default:
               System.out.println("Invalid option. Try again.");
         }

      } while(option != 4);

      scanner.close();
   }
//Creating account object

   public static void main(String[] args){
      BankAccount MyAccount = new BankAccount("arl234588", "Andres Calderon", 1000000);
      MyAccount.DisplayMenu();

   }
}





