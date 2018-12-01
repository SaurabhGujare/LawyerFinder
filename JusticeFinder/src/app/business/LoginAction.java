/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.business;

import app.business.interfaces.Actions;
import app.data.DBUtil;
import app.data.DataStore;
import app.data.Session;
import app.entities.user.UserAccount;

/**
 *
 * @author Ninad Subhedar (NUID : 001472377)
 */
public class LoginAction implements Actions{
    
    private static final DataStore DATA_STORE = DataStore.getInstance();
    
    public UserAccount login(String username, String password){
        Session.createNewSession(DATA_STORE.getUSER_ACCOUNTS().getEntry(username));
        return Session.getUserAccount();
    }
    
    public void logout(){
        Session.clearSession();
        DBUtil.getInstance().storeSystem(DATA_STORE);
    }
}
