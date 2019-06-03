package com.company;

// public means other classes have unrestricted access to this class
public class Account {

    // fields aka class variables; usually private to adhere to encapsulation principle
    // outside users don't need to know internal workings (like fields) of this class
    private String number;
    private double balance;
    private String name;
    private String email;
    private String phone;

    // constructor; can be overloaded
    public Account() {
        // set some default values if none are passed in by calling the other constructor below this one
        this("0000", 0, "John Doe", "doe@john.com", "(123)456-7890");
        System.out.println("Calling my constructor method for Account class without default values");
    }

    // constructor with all fields specified
    public Account(String number, double balance, String name, String email, String phone) {
        System.out.println("Calling my constructor method for Account class with init values");
        this.number = number;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    // constructor with only some params specified; set the other fields to default
    public Account(String name, String email, String phone) {
        this("0000", 0, name, email, phone);
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited " + amount + ", Balance is " + this.balance);
    }

    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Withdrew " + amount + ", Balance is " + this.balance);
        } else {
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        }
    }

    // auto-generate getters and setters: Code >> Generate >> select fields
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
