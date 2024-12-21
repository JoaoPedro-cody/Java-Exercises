package Application;

import Entities.BankAccount;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your details: ");
        System.out.print("Account Number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Balance: ");
        double balance = sc.nextDouble();
        BankAccount conta = new BankAccount(accountNumber, holder, balance);

        System.out.println();
        System.out.println(conta);

        System.out.println();
        System.out.print("Deposit balance: ");
        double depositValue = sc.nextDouble();
        conta.deposit(depositValue);

        System.out.println();
        System.out.println(conta);

        System.out.println();
        System.out.print("withdraw balance: ");
        double withdrawValue = sc.nextDouble();
        conta.withdraw(withdrawValue);

        System.out.println();
        System.out.println(conta);

    }
}
