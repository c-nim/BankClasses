package org.example;

import java.util.HashSet;
import java.util.Set;

public class BankNew {
    private Set<BankAccount> Acc = new HashSet<>();


    public void addAccount(BankAccount bankAccount) {
        this.Acc.add(bankAccount);
    }

    public void removeAccount(BankAccount bankAccount) {
        this.Acc.remove(bankAccount);
    }

    public BankAccount findAccount(int accountNum) {
        for (BankAccount ba : Acc) {
            if (ba.getAccountNumber() == accountNum) {
                return ba;
            }
        }

        return null;
    }
}

