/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.entities.user;

import app.data.directories.Directory;
import app.data.directories.interfaces.DirectoryEntry;
import app.data.org.StateBarAssociation;
import app.entities.Rating;
import app.entities.roles.Roles;
import app.entities.workqueues.CaseFileRequestWorkQueue;
import app.entities.workqueues.GrievanceRequest;
import app.entities.workqueues.GrievanceRequestWorkQueue;
import app.entities.workqueues.WorkQueue;
import app.utils.CommonUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

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
    private String lawSchool;
    private Directory<Integer, StateBarAssociation> allowedStateBars;
    private Directory<Integer, StateBarAssociation> requestedStateBars;
    private WorkQueue workqueue;
    private WorkQueue casesWorkQueue;
    private Directory<String, LegalEntity> clientList;
    private Directory<String,Rating> ratings;
    private List<String> areaOfPractice;
    private File picFile;
    private Double fees;

    public WorkQueue getCasesWorkQueue() {
        return casesWorkQueue;
    }

    public void setCasesWorkQueue(WorkQueue casesWorkQueue) {
        this.casesWorkQueue = casesWorkQueue;
    }

    public String getLawSchool() {
        return lawSchool;
    }

    public void setLawSchool(String lawSchool) {
        this.lawSchool = lawSchool;
    }

    
    public Double getFees() {
        return fees;
    }

    public void setFees(Double fees) {
        this.fees = fees;
    }

    public File getPicFile() {
        return picFile;
    }

    public void setPicFile(File picFile) {
        this.picFile = picFile;
    }

    public List<String> getAreaOfPractice() {
        return areaOfPractice;
    }

    public void setAreaOfPractice(List<String> areaOfPractice) {
        this.areaOfPractice = areaOfPractice;
    }

    public Integer getRating() {
        return CommonUtils.calulateRating(ratings);
    }

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
        this.casesWorkQueue= new CaseFileRequestWorkQueue();
        this.clientList = new Directory<>();
        this.areaOfPractice = new ArrayList<>();
        this.ratings = new Directory<>();
        this.address = new Address();
        this.workContact = new ContactDetails();
    }

    public Directory<String,Rating> getRatings() {
        return ratings;
    }

    public void setRatings(Directory<String,Rating> ratings) {
        this.ratings = ratings;
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

    @Override
    public String getName() {
        return toString();
    }
    
}
