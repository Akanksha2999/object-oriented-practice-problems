package com.bridgelabz;

public class Account {

    //Initialized variables
    int accountNumber;
    String name;
    double amount;

    //Details method for person name account number and initial amount in account
    void details(int num, String personName, double a) {
        accountNumber = num;
        name = personName;
        amount = a;
    }

    //Shoe method to display the person name account number and amount
    void show() {
        System.out.println(accountNumber + " " + name + " " + amount);
    }

    //Deposit method to deposit amount into the account
    void deposit(double a) {
        amount += a;
        System.out.println("Deposit amount:" + a);
    }

    //Debit method to remove money from account
    void debit(double a) {
        if (amount < a)
            System.out.println("Debit amount exceeded account balance.");
        else
            amount -= a;
        System.out.println("Withdraw amount:" + a);
    }

    //Check balance method to check the balance in account
    void checkbalance() {
        System.out.println("Balance is:" + amount);
    }
}//End of class account

class test {
    public static void main(String[] args) {

        //Main method to call all the methods
        Account account = new Account();
        System.out.println("The person name and its account number and initilial account balance is shown below:");
        account.details(255, "Akanksha", 1000);
        account.show();

        System.out.println(" ");
        System.out.println("Money deposited is:");
        account.deposit(40000);
        account.checkbalance();

        System.out.println(" ");
        System.out.println("Money debited is:");
        account.debit(42000);
        account.checkbalance();
    }
}//End of class test
