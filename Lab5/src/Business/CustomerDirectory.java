package Business;

import Business.Abstract.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ninad, Akshay, Saurabh
 */
public class CustomerDirectory {
    
    private List<User> customerList;
    
    public CustomerDirectory(){
        customerList = new ArrayList<>();
    }

    public List<User> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<User> supplierList) {
        this.customerList = supplierList;
    }
    
}
