package com.company;

public class Main {

    public static void main(String[] args) {

        Account myAccount = new Account();

        // use public methods to work with private fields
        System.out.println("Number = " + myAccount.getNumber());    // before set, is null
        myAccount.setNumber("888");
        System.out.println("Number = " + myAccount.getNumber());

        myAccount.withdraw(50);
        myAccount.deposit(100);
        myAccount.withdraw(80);

        Account otherAccount = new Account("123", 500, "Anna Pie", "pie@anna.com", "(303)303-3030");
        System.out.println("balance = " + otherAccount.getBalance() + " and email = " + otherAccount.getEmail());

    }
}
