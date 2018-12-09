/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.entities.user;

import app.data.directories.interfaces.DirectoryEntry;
import app.entities.roles.Role;
import app.entities.roles.Roles;

/**
 *
 * @author Ninad Subhedar (NUID : 001472377)
 */
public  class UserAccount implements DirectoryEntry<String>{
    
    private String username;
    private String password;
    private String retypedPassword;
    private User user;
    
    public UserAccount(String username, String password,User user, String retypedPassword) {
        this.username = username;
        this.password = password;
        this.retypedPassword = retypedPassword;        
        this.user = user;
        user.setAccount(this);
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getRetypedPassword() {
        return retypedPassword;
    }

    public void setRetypedPassword(String retypedPassword) {
        this.retypedPassword = retypedPassword;
    }
    
    
    @Override
    public String getKey() {
        return this.username;
    }
    
}
