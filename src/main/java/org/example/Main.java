package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {
        Bank newBank = new Bank();
        newBank.AddAccount(new BankAccount(45));
        newBank.AddAccount(new BankAccount(50, 100.00));
        newBank.AddAccount(new BankAccount(55, 100.00, "Clara"));

        newBank.printAccounts();
        System.out.println(newBank.GetAllAccount());
        System.out.println(newBank.GetAllAccountByIndex(2));
        System.out.println(newBank.calcAverageBalance());
        newBank.getArrayOfAccounts();
        newBank.RemoveAccountByAccountNumber(45);
        newBank.getArrayOfAccounts();
        newBank.RemoveAccountByIndex(0);
        newBank.getArrayOfAccounts();
        }
    }
