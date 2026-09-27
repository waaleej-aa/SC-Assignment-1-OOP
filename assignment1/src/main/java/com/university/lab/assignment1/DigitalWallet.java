/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.university.lab.assignment1;

/**
 *
 * @author waleeja
 */
public class DigitalWallet {
    private final String accountHolder;
    private double balance;
    private final String pinCode;

    public DigitalWallet(String accountHolder, double balance, String pinCode) {
        this.accountHolder = accountHolder;
        this.balance = (balance < 0) ? 0 : balance;
        this.pinCode = pinCode;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    
    public boolean withdraw(double amount, String enteredPin) {
        if (amount <= 0) return false;
        if (!pinCode.equals(enteredPin)) return false;
        if (amount > balance) return false;

        balance -= amount;
        return true;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}
