/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.entities.user;

import app.data.directories.Directory;
import app.data.directories.interfaces.DirectoryEntry;
import app.data.org.StateBarAssociation;
import app.entities.roles.Roles;
import app.entities.workqueues.GrievanceRequest;
import app.entities.workqueues.GrievanceRequestWorkQueue;
import app.entities.workqueues.WorkQueue;

/**
 *
 * @author saurabhgujare
 */
public class Lawyer extends User implements DirectoryEntry<String>{
    private String firstName, middleName, lastName;
    private Address address;
    private ContactDetails workContact;
    private String ssn;
    private String email;
    private String qualification;
    private String specialization;
    private String yearsOfPractice;
    private Directory<Integer, StateBarAssociation> allowedStateBars;
    private Directory<Integer, StateBarAssociation> requestedStateBars;
    private WorkQueue workqueue;
    private Directory<String, LegalEntity> clientList;

    public Directory<String, LegalEntity> getClientList() {
        return clientList;
    }

    public void setClientList(Directory<String, LegalEntity> clientList) {
        this.clientList = clientList;
    }

    public Directory<Integer, StateBarAssociation> getRequestedStateBars() {
        return requestedStateBars;
    }

    public void setRequestedStateBars(Directory<Integer, StateBarAssociation> requestedStateBars) {
        this.requestedStateBars = requestedStateBars;
    }

    public Directory<Integer, StateBarAssociation> getAllowedStateBars() {
        return allowedStateBars;
    }

    public void setAllowedStateBars(Directory<Integer, StateBarAssociation> allowedStateBars) {
        this.allowedStateBars = allowedStateBars;
    }

    public WorkQueue getWorkqueue() {
        return workqueue;
    }

    public void setWorkqueue(WorkQueue workqueue) {
        this.workqueue = workqueue;
    }
    
    public Lawyer() {
        super(Roles.LAWYER);
        this.allowedStateBars= new Directory<>();
        this.requestedStateBars = new Directory<>();
        this.workqueue = new GrievanceRequestWorkQueue();
        this.clientList = new Directory<>();
    }

    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ContactDetails getWorkContact() {
        return workContact;
    }

    public void setWorkContact(ContactDetails workContact) {
        this.workContact = workContact;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getYearsOfPractice() {
        return yearsOfPractice;
    }

    public void setYearsOfPractice(String yearsOfPractice) {
        this.yearsOfPractice = yearsOfPractice;
    }

    @Override
    public String getKey() {
        return ssn;
    }
    @Override
    public String toString(){
        return this.firstName+" "+this.lastName;
    }
    
}
