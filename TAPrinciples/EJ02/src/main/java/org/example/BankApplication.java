package org.example;

import java.util.ArrayList;
import java.util.List;

public class BankApplication {
    private List<UserAccount> userAccounts;
    private UserAccount admin;

    public BankApplication() {
        userAccounts = new ArrayList<>();
        // Crear un usuario administrador (puede estar codificado previamente)
        admin = new UserAccount("admin", "adminpassword");
    }

    public void addUserAccount(String username, String password) {
        UserAccount newUser = new UserAccount(username, password);
        userAccounts.add(newUser);
    }

    public UserAccount getUserAccount(String username) {
        for (UserAccount account : userAccounts) {
            if (account.getUsername().equals(username)) {
                return account;
            }
        }
        return null;
    }
}
