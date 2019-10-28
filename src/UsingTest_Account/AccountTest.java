package UsingTest_Account;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

///right click in java-master
//open module settings
//modulus
//dependencies
//click Junit and change (test) to (compiler)

class AccountTest {


    @org.junit.jupiter.api.Test
    void testDeposit() {
        Account jose = new Account(100,100,"jose");
        //           EXPECTED: 200      //deposit 100 + balance 100 = 200 --> test = true
        assertEquals(300, jose.deposit(200, Account.typeAcc.Cheking));

    }

    @org.junit.jupiter.api.Test
    void withdowl() {

        Account jose = new Account(1000,100,"jose");
        //           EXPECTED: 800      //Withdowl 200 - (+balance 1000) = 800 --> test = true
        assertEquals(800, jose.Withdowl(200, Account.typeAcc.Cheking));
    }

    @Test
    void getBalance() {
        Account Mariana = new Account(500,100,"Mariana");
        assertEquals(500,Mariana.getCheking());
    }

    @Test
    void getName() {
        Account Mariana = new Account(10000,100,"Mariana");
        assertEquals("Mariana",Mariana.getName());
    }

    @Test
    void transfer() {
        Account Mariana = new Account(10000,100,"Mariana");
        assertEquals(10100,Mariana.Transfer(Account.typeAcc.Saving, Account.typeAcc.Cheking,100));
    }
}