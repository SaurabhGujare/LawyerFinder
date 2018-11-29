/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.entities;

import app.data.directories.interfaces.DirectoryEntry;
import app.entities.roles.Role;
import app.entities.roles.Roles;
import javax.swing.JPanel;

/**
 *
 * @author arele
 */
public class StateBarAssociation extends User implements DirectoryEntry<String>{
    private String stateBarAssociationName;
    private String stateBarAssociationID;
    private Address workaddress;
    private ContactDetails workphone;
    private String email;

    public Address getWorkaddress() {
        return workaddress;
    }

    public void setWorkaddress(Address workaddress) {
        this.workaddress = workaddress;
    }

    public ContactDetails getWorkphone() {
        return workphone;
    }

    public void setWorkphone(ContactDetails workphone) {
        this.workphone = workphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStateBarAssociationName() {
        return stateBarAssociationName;
    }

    public void setStateBarAssociationName(String stateBarAssociationName) {
        this.stateBarAssociationName = stateBarAssociationName;
    }

    public String getStateBarAssociationID() {
        return stateBarAssociationID;
    }

    public void setStateBarAssociationID(String stateBarAssociationID) {
        this.stateBarAssociationID = stateBarAssociationID;
    }

    @Override
    public String getKey() {
        return stateBarAssociationID;
    }

    public StateBarAssociation() {
        super(Roles.STATE_BAR_ASSOCIATION);
    }    
    
}
