/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Abstract.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ninad, Akshay, Saurabh
 */
public class SupplierDirectory {
    
    private List<User> supplierList;
    
    public SupplierDirectory(){
        supplierList = new ArrayList<>();
    }

    public List<User> getSupplierList() {
        return supplierList;
    }

    public void setSupplierList(List<User> supplierList) {
        this.supplierList = supplierList;
    }
    
    
}
