/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.data.org;

import app.data.directories.Directory;
import app.entities.user.Address;
import app.entities.user.ContactDetails;
import app.entities.workqueues.CourtWorkQueue;

/**
 *
 * @author arele
 */
public class Court extends Organization{
    
    private static int count = 0;
    private String courtName;
    private String courtID;
    private Address workaddress;
    private ContactDetails workphone;
    private String email;
    
    public Court(){
    
        super(new CourtWorkQueue(), new Directory(),null);
        count++;
        id = count;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Court.count = count;
    }

    public String getCourtName() {
        return courtName;
    }

    public void setCourtName(String courtName) {
        this.courtName = courtName;
    }

    public String getCourtID() {
        return courtID;
    }

    public void setCourtID(String courtID) {
        this.courtID = courtID;
    }

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
    
    @Override
    public String toString() {
        return courtName;
    }
}
