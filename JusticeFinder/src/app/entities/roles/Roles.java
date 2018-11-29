/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.entities.roles;

import app.userinterface.admin.AdminPanel;
import app.userinterface.LawyerPanel;
import app.userinterface.sba.StateBarAssociationPanel;
import app.userinterface.lawyer.LawyerPanel;
import app.userinterface.StateBarAssociationPanel;


/**
 *
 * @author Ninad Subhedar (NUID : 001472377)
 */
public enum Roles {

    /**
     *
     */
    ADMIN(new Role(AdminPanel.class)),
    LEGAL_ENTITY(null),
    LAWYER(new Role(LawyerPanel.class)),
    STATE_BAR_ASSOCIATION(new Role(StateBarAssociationPanel.class));
    private final Role type;

    private Roles(Role role) {
        this.type = role;
    }

    public Role getType() {
        return type;
    }
    
}
