/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.entities.workqueues;

import app.entities.LawyerApprovalRequest;

/**
 *
 * @author Ninad Subhedar (NUID : 001472377)
 */
public class StateBarAssoWorkQueue extends WorkQueue<LawyerApprovalRequest>{

    @Override
    protected LawyerApprovalRequest getNewItem() {
        return new LawyerApprovalRequest();
    }
    
}
