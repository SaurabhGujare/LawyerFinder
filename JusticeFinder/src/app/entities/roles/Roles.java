/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.entities.roles;

import app.userinterface.AdminPanel;


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
    LAWYER(null);
    
    private final Role type;

    private Roles(Role role) {
        this.type = role;
    }

    public Role getType() {
        return type;
    }
    
}
