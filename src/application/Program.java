package application;

import model.entities.Account;
import model.exceptions.WithdrawErrorException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        try {
            System.out.println("Enter account data:");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double initialBalance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account acc = new Account(number, holder, initialBalance, withdrawLimit);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            double amountWithdraw = sc.nextDouble();
            acc.withdraw(amountWithdraw);
            System.out.println("New balance: " + acc.getBalance());
        }
        catch (WithdrawErrorException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Unexpect error");
        }

        sc.close();

    }
}
