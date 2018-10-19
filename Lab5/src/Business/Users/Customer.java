/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;

import Business.Abstract.User;
import java.util.Date;

/**
 *
 * @author harshalneelkamal
 */
public class Customer extends User {
    private Date dateCreated;

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    
    public Customer(String password, String userName) {
        super(password, userName,"CUSTOMER");
        dateCreated = new Date();
    }

    @Override
    public boolean verify(String password) {
        if(password.equals(getPassword()))
            return true;
        return false;
    }
}
