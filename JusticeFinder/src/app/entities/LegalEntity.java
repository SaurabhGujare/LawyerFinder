/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.entities;

import java.util.Date;

/**
 *
 * @author Ninad Subhedar (NUID : 001472377)
 */
public class LegalEntity {
    
    private String firstName, middleName, lastName;
    private Date dob;
    Address priamryAddress;
    ContactDetails primaryContact;

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

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Address getPriamryAddress() {
        return priamryAddress;
    }

    public void setPriamryAddress(Address priamryAddress) {
        this.priamryAddress = priamryAddress;
    }

    public ContactDetails getPrimaryContact() {
        return primaryContact;
    }

    public void setPrimaryContact(ContactDetails primaryContact) {
        this.primaryContact = primaryContact;
    }
            
}
