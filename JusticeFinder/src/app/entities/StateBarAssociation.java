/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.entities;

import app.data.directories.interfaces.DirectoryEntry;
import app.entities.roles.Roles;

/**
 *
 * @author arele
 */
public class StateBarAssociation extends User implements DirectoryEntry<String>{
    private String stateBarAssociationName;
    private String stateBarAssociationID;

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

    @Override
    public String toString() {
        return stateBarAssociationID;
    }

    
    
    
    
}
