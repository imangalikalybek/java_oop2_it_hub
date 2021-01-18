package com.company.oop2;

public class TestAccount {

    public static void main(String[] args) {

        CustomerB customerB = new CustomerB(153, "Kairos", 'm');
        Account account = new Account(456, customerB, 20000);
        System.out.println(account);
        System.out.println(account.deposit(850));
        System.out.println(account.withdraw(7000));
    }

}
