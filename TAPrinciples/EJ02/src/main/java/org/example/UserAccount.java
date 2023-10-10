package org.example;

import lombok.Data;

@Data
public class UserAccount {
    private String username;
    private String password;
    private double balance;

    public UserAccount(String username, String password) {
        this.username = username;
        this.password = password;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public boolean transfer(UserAccount targetAccount, double amount) {
        if (balance >= amount) {
            balance -= amount;
            targetAccount.deposit(amount);
            return true;
        }
        return false;
    }
}
