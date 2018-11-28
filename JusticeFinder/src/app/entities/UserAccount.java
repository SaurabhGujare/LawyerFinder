/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.entities;

import app.data.directories.interfaces.DirectoryEntry;
import app.entities.roles.Role;
import app.entities.roles.Roles;

/**
 *
 * @author Ninad Subhedar (NUID : 001472377)
 */
public abstract class UserAccount implements DirectoryEntry<String>{
    
    private String username;
    private String password;
    protected Roles role;

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }

    public UserAccount(){
        
    }
    
    public UserAccount(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getKey() {
        return this.username;
    }
    
}
