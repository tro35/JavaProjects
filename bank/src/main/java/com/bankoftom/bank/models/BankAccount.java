package com.bankoftom.bank.models;

public class BankAccount {
    private String name;
    private double balance;
    private String clientType;

    public BankAccount() {
    }

    public BankAccount(String name, double balance, String clientType) {
        this.name = name;
        this.balance = balance;
        this.clientType = clientType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }
}
