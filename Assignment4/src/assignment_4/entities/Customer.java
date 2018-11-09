/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4.entities;

/**
 *
 * @author harshalneelkamal
 */
public class Customer {
    private int customerId;
    private String fname, lname;

    public Customer(int customerId, String fname, String lname) {
        this.customerId = customerId;
        this.fname = fname;
        this.lname = lname;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    @Override
    public String toString() {
        return "Customer{" + "customerId=" + customerId + ", fname=" + fname + ", lname=" + lname + '}';
    }
    
    
}
