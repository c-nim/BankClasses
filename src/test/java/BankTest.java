import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.example.Bank;
import org.example.BankAccount;
import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class BankTest {

    Bank newBank;
    BankAccount newAccount;
    int accountNum;

    @Before
    public void setup() throws Exception{
        newBank = new Bank();
        newBank.AddAccount(new BankAccount(45));
        newBank.AddAccount(new BankAccount(50, 100.00));
        newBank.AddAccount(new BankAccount(55, 100.00, "Clara"));

    }

    @Test
    public void FindOne(){
        BankAccount ba = newBank.findAccount(45);
        Assert.assertEquals(45, ba.getAccountNumber());
        Assert.assertEquals(0, ba.getBalance(), 0.0001);
        Assert.assertEquals("Account 45", ba.getAccountName());
    }

    @Test
    public void FindTwo(){
        BankAccount ba = newBank.findAccount(50);
        Assert.assertEquals(50, ba.getAccountNumber());
        Assert.assertEquals(100.00, ba.getBalance(), 0.0001);
        Assert.assertEquals("Account 50", ba.getAccountName());
    }
    @Test
    public void ExceptionOnDuplicate() throws Exception{
        BankAccount ba = newBank.findAccount(45);

        try{
            newBank.AddAccount(ba);
            Assert.fail("Exception wasn't called");
        }catch (Exception e){
            Assert.assertEquals("This account already exists", e.getMessage());
        }
    }
    @Test
    public void DuplicateAccountTest(){
        BankAccount ba = new BankAccount(1);
        try{ newBank.AddAccount(ba);
            Assert.fail("Exception wasnt called");
        } catch (Exception e){
            Assert.assertEquals("This account already exists", e.getMessage());

        }

    }

    @Test
    public void GetAllAccountTest() {
        Assert.assertEquals(newBank.GetAllAccountByIndex(0), newBank.GetAllAccount().get(0));
    };


    @Test
    public void AccountByIndexTest(){
        int index = 2;
        int accountNum = 55;

        Assert.assertEquals(accountNum,
                newBank.GetAllAccountByIndex(index).getAccountNumber());
    }

    @Test
    public void AverageBalanceTest() throws Exception {
        Bank ba = new Bank();
        ba.AddAccount(new BankAccount(45, 200.00));
        ba.AddAccount(new BankAccount(50, 100.00));
        Assert.assertEquals(150, ba.calcAverageBalance(),0.0001);
    }
    @Test
    public void ArrayAccountsTest() {
        BankAccount[] newArr = newBank.getArrayOfAccounts();
        Assert.assertEquals(newBank.GetAllAccountByIndex(0), newArr[0]);
    }

    @Test
    public void removeByAccountNo() throws Exception {
        Bank ba = new Bank();
        ba.AddAccount(new BankAccount(45, 200.00));
        ba.RemoveAccountByAccountNumber(45);
        Assert.assertEquals(null, ba.findAccount(45));
    }


    @After
    public void Cleanup(){

    }


}
