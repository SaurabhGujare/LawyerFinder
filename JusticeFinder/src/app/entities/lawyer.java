/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.entities;

/**
 *
 * @author saurabhgujare
 */
public class lawyer {
    private String firstName, middleName, lastName;
    private Address address;
    private ContactDetails workContact;
    private String ssn;
    private String email;
    private String qualification;
    private String specialization;
    private String yearsOfPractice;

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
    
    
}
