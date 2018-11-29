/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.entities;

import app.entities.roles.Roles;

/**
 *
 * @author Akshay Relekar
 */
public abstract class User {
    
    Roles role;
    UserAccount account;

    public UserAccount getAccount() {
        return account;
    }

    public void setAccount(UserAccount account) {
        this.account = account;
    }

    public User(Roles role) {
        this.role = role;
    }

    public Roles getRole() {
        return role;
    }
    
}
