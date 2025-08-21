package com.xworkz.bank;
import com.xworkz.bank.Bank.Bank;

public class BankRunner {
    public static void main(String args[]){

        Bank bank=new Bank();

        bank.setBankName("Karnataka Bank");
        bank.setBranch(12);
        bank.setLocation("Kattehakkalu");

        System.out.println("Bank Name: "+bank.getBankName());
        System.out.println("Branch ID: "+bank.getBranch());
        System.out.println("Location :"+bank.getLocation());
    }
}
