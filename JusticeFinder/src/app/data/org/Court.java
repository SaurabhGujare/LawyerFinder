/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.data.org;

import app.data.directories.Directory;
import app.entities.user.Address;
import app.entities.user.ContactDetails;
import app.entities.user.CourtAdmin;
import app.entities.user.Judge;
import app.entities.user.StateBarAssoAdmin;
import app.entities.workqueues.CourtWorkQueue;
import app.entities.workqueues.StateBarAssoWorkQueue;
import java.util.ArrayList;

/**
 *
 * @author arele
 */
public class Court extends Organization{
    
    private static int count = 0;
    private String courtName;
    private String courtemailID;
    private Address workaddress;
    private ContactDetails workphone;
    private String email;
    private ArrayList<Judge> judgeDirectory;
    
    public Court(){
    
        super(new CourtWorkQueue(), new Directory(),null);
        super.admin = new CourtAdmin(this);
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

    public String getCourtemailID() {
        return courtemailID;
    }

    public void setCourtemailID(String courtemailID) {
        this.courtemailID = courtemailID;
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

    public ArrayList<Judge> getJudgeDirectory() {
        return judgeDirectory;
    }

    public void setJudgeDirectory(ArrayList<Judge> judgeDirectory) {
        this.judgeDirectory = judgeDirectory;
    }
    
    
    
    @Override
    public String toString() {
        return courtName;
    }
}
