/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.entities.workqueues;

import app.entities.user.LegalEntity;
import app.entities.user.UserAccount;
import java.util.Date;

/**
 *
 * @author Saurabh Gujare (NUID : 001424874)
 */
public class GrievanceRequest extends WorkItem {
    private LegalEntity legalEntity;


    public GrievanceRequest(String message, UserAccount sender, UserAccount receiver) {
        super(message, sender, receiver);
    }

    public LegalEntity getLegalEntity() {
        return legalEntity;
    }

    public void setLegalEntity(LegalEntity legalEntity) {
        this.legalEntity = legalEntity;
    }    
}
