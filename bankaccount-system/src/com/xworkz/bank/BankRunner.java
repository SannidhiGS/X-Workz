package com.xworkz.bank;

import com.xworkz.bank.bankaccount.BankAccount;
import com.xworkz.bank.bankaccount.SavingAccount;

public class BankRunner {
    public static void main(String args[]){
        BankAccount sanniAccount=new BankAccount();
        BankAccount shabbiAccount=new BankAccount();
        SavingAccount momAccount=new SavingAccount();
        SavingAccount sharathAccount=new SavingAccount();
        SavingAccount himaniAccount=new SavingAccount();
        SavingAccount daivikAccont=new SavingAccount();
        SavingAccount anuAccount=new SavingAccount();
        SavingAccount shashiAccount=new SavingAccount();

        sanniAccount.transfer(shabbiAccount,500);
        momAccount.transfer(sanniAccount,12000);
        shabbiAccount.transfer(momAccount,799);
        sharathAccount.transfer(himaniAccount,900);
        himaniAccount.transfer(daivikAccont,9000);
        daivikAccont.transfer(anuAccount,7000);
        anuAccount.transfer(shabbiAccount,890);
        sharathAccount.transfer(shashiAccount,10000);

        System.out.println("Sannidhi: "+sanniAccount.getBalance());
        System.out.println("Shabbi: "+shabbiAccount.getBalance());
        System.out.println("Mom: "+momAccount.getBalance());
        System.out.println("Sharath"+sharathAccount.getBalance());
        System.out.println("Himani"+himaniAccount.getBalance());
        System.out.println("Daivik"+daivikAccont.getBalance());
        System.out.println("Anu"+anuAccount.getBalance());
        System.out.println("Shashi"+shashiAccount.getBalance());

    }
}
