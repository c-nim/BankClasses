import junit.framework.*;
import org.junit.Test;
import org.example.BankAccount;

public class BankAccountTest {

    @Test
    public void CreateWithAllDetails(){
        int accountNumber = 1;
        double balance = 1.562;
        String accountName = "Bank Account";

        BankAccount ba = new BankAccount(accountNumber, balance, accountName);

        Assert.assertEquals(balance, ba.getBalance(), 0.0001);
        Assert.assertEquals(accountNumber, ba.getAccountNumber());
        Assert.assertEquals(accountName, ba.getAccountName());
    }

    @Test
    public void CreateWithAccountNumber(){
        int accountNumber = 2;

        BankAccount myBank = new BankAccount(accountNumber);

        Assert.assertEquals(accountNumber, myBank.getAccountNumber());

    }

    @Test
    public void CreateWithAccountNumberAndBalance(){
        int accountNumber = 23;
        double balance = 56.00;

        BankAccount clarasAccount = new BankAccount(accountNumber, balance);

        Assert.assertEquals(accountNumber, clarasAccount.getAccountNumber());
        Assert.assertEquals(balance, clarasAccount.getBalance());
    }


    // EXTENSION
    @Test
    public void AddFunds(){
        int accountNum = 50;
        double startingBalance = 10.00;
        double fundsToAdd = 10.50;
        double total = 20.50;

        BankAccount newAccount = new BankAccount(accountNum, startingBalance);

        Assert.assertEquals(total, newAccount.AddFunds(fundsToAdd));

    }

    @Test
    public void RemoveFunds() throws Exception {
        int accountNum = 3;
        double startingBalance = 100.00;
        double fundsToRemove= 50.00;
        double total = 50.00;

        BankAccount newAccount = new BankAccount(accountNum, startingBalance);

        Assert.assertEquals(total, newAccount.RemoveFunds(fundsToRemove));
    }

    @Test
    public void RemoveFundsFails(){
        int accountNum = 0;
        double startingBalance = 0;
        double fundsToRemove= 50.00;

        BankAccount newAccount = new BankAccount(accountNum, startingBalance);
        try {
            newAccount.RemoveFunds(fundsToRemove);
            Assert.fail(); // This will cause failure if reached
        }catch (Exception e){
            Assert.assertEquals("You can't have minus funds!", e.getMessage());
        }
    }
}
