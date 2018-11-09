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
public class SalesPerson {
    
    private int salesPersonId;
    private String fname, lname;

    public SalesPerson(int salesPersonId, String fname, String lname) {
        this.salesPersonId = salesPersonId;
        this.fname = fname;
        this.lname = lname;
    }

    public int getSalesPersonId() {
        return salesPersonId;
    }

    public void setSalesPersonId(int salesPersonId) {
        this.salesPersonId = salesPersonId;
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
        return "SalesPerson{" + "salesPersonId=" + salesPersonId + ", fname=" + fname + ", lname=" + lname + '}';
    }
    
}
