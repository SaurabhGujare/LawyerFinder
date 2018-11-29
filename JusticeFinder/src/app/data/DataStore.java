/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.data;

import app.data.directories.Directory;
import app.data.directories.UserAccountDirectory;
import app.entities.Admin;
import app.entities.Lawyer;
import app.entities.LegalEntity;
import app.entities.StateBarAssociation;
import app.entities.UserAccount;

/**
 *
 * @author Ninad Subhedar (NUID : 001472377)
 */
public class DataStore {

    private static DataStore store;
    private Directory<String, UserAccount> USER_ACCOUNTS = new UserAccountDirectory();
    private Directory<String, LegalEntity> LEGAL_ENTITY_DIRECTORY = new Directory();
    private Directory<String, Lawyer> LAWYER_DIRECTORY = new Directory();
    private Directory<String, StateBarAssociation> STATEBARASSOCIATION_DIRECTORY = new Directory();
    private DataStore(){
        initValues();
    }
    
    public static DataStore getInstance(){
        
        if(store == null){
            store = DBUtil.getInstance().retrieveSystem();
        }
        if(store == null){
            store = new DataStore();
            DBUtil.getInstance().storeSystem(store);
        }
        return store;
    }

    public Directory<String, UserAccount> getUSER_ACCOUNTS() {
        return USER_ACCOUNTS;
    }

    public Directory<String, LegalEntity> getLEGAL_ENTITY_DIRECTORY() {
        return LEGAL_ENTITY_DIRECTORY;
    }

    public Directory<String, StateBarAssociation> getSTATEBARASSOCIATION_DIRECTORY() {
        return STATEBARASSOCIATION_DIRECTORY;
    }

    public Directory<String, Lawyer> getLAWYER_DIRECTORY() {
        return LAWYER_DIRECTORY;
    }
    
    private void initValues(){
        try {
            USER_ACCOUNTS.addNew(new UserAccount("admin", "admin", new Admin())); //super Admin
        } catch (Exception ex) {
            //super Admin present
            //ex.printStackTrace();
        }
        try {
            StateBarAssociation sba = new StateBarAssociation();
            USER_ACCOUNTS.addNew(new UserAccount("akshay", "akshay", sba)); // statebarassociation
            STATEBARASSOCIATION_DIRECTORY.addNew(sba);
        } catch (Exception ex) {
            //super Admin present
            //ex.printStackTrace();
        }
        try {
            USER_ACCOUNTS.addNew(new UserAccount("lawyer", "lawyer", new Lawyer())); //Lawyer
        } catch (Exception ex) {
            //super Admin present
            //ex.printStackTrace();
        }

    }
}
