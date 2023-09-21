package org.example;
import java.util.ArrayList;
import java.util.List;

public class Bank{

    private List<BankAccount> Accounts = new ArrayList<BankAccount>();

    public Bank(){}

    public BankAccount findAccount(int AccountNumber){

        BankAccount found = null;
        for (BankAccount ba: Accounts) {
            if (ba.getAccountNumber() == AccountNumber){
                found = ba;
                break;
            }
        }

        return found;
    }

    public void AddAccount(BankAccount newBankAccount) throws Exception {
        for (int i = 0; i < Accounts.size(); i++) {
            if(Accounts.get(i) == newBankAccount || Accounts.get(i).getAccountNumber() == newBankAccount.getAccountNumber()){
                Object Throw;
                throw new Exception("This account already exists");
            }
        }
        Accounts.add(newBankAccount);
    }
    public List<BankAccount> GetAllAccount(){
        return  Accounts;
    }
    public BankAccount GetAllAccountByIndex(int index){
        if(index < 0 || index > this.Accounts.size()) {
            return null;
        }
         return this.Accounts.get(index);
    }

    public void printAccounts() {
        for(BankAccount account: Accounts){
            System.out.println(account);
        }
    }

    public void RemoveAccountByIndex(int index){
        Accounts.remove(index);
    }
    public void RemoveAccountByAccountNumber(int accountNum){
        BankAccount ba = findAccount(accountNum);
        Accounts.remove(ba);
    }

    public BankAccount[] getArrayOfAccounts() {
        BankAccount[] arr = new BankAccount[Accounts.size()];
        Accounts.toArray(arr);
        for(int i = 0; i <arr.length; i++){
            System.out.println(arr[i].getAccountName() + ", ");
        };
        return arr;
    }


    public double calcAverageBalance(){
        double total = 0;
        for(BankAccount ba: Accounts) {
            total += ba.getBalance();
        }
        return total / Accounts.size();
    }




}