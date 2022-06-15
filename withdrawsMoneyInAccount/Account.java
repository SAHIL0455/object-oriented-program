package com.brigdelab.withdrawsMoneyInAccount;

import java.util.Scanner;

public class Account extends AccountBalance {
    public static void main(String[] args) {
        Account account = new Account();
        Scanner scanner = new Scanner(System.in);
        boolean isExit = false;
        while (!isExit) {
            System.out.println("Please select Option \n1. Check Your Account Balances\n2. Debit Amount\n3. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Your Account Balances is " + account.getMainBalance());
                    break;
                case 2:
                    System.out.println("Enter the debit amount");
                    int debitAmount = scanner.nextInt();
                    account.debitAmount(debitAmount);
                    break;
                case 3:
                    isExit = true;
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Please Select the Valid Number");
            }
        }
    }

    public void debitAmount(int debit) {
        if (super.getMainBalance() >= debit) {
            int balance = super.getMainBalance() - debit;
            System.out.println("Now Your Account Balances is " + balance);
            super.setMainBalance(balance);
        } else {
            System.out.println("Debit amount exceeded account balance");
        }
    }
}
