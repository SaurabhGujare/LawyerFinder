/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.entities;

import app.entities.workqueues.WorkItem;
import java.util.Date;

/**
 *
 * @author Akshay Relekar
 */
public class LawyerApprovalRequest implements WorkItem{
    
    private Lawyer lawyer;
    private String requestmessage;
    private int requestid;
    private Date requestdate;
    private String status = "PENDING";

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Lawyer getLawyer() {
        return lawyer;
    }

    public void setLawyer(Lawyer lawyer) {
        this.lawyer = lawyer;
    }

    public String getRequestmessage() {
        return requestmessage;
    }

    public void setRequestmessage(String requestmessage) {
        this.requestmessage = requestmessage;
    }

    public int getRequestid() {
        return requestid;
    }

    public void setRequestid(int requestid) {
        this.requestid = requestid;
    }

    public Date getRequestdate() {
        return requestdate;
    }

    public void setRequestdate(Date requestdate) {
        this.requestdate = requestdate;
    }

    @Override
    public String toString() {
        return requestid+"";
    }
    
    
}
