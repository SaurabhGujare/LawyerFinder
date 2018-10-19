package Business.Users;

import Business.Abstract.User;
import Business.CustomerDirectory;
import Business.SupplierDirectory;

/**
 *
 * @author Ninad, Akshay, Saurabh
 */
public class Admin extends User {
    
    public SupplierDirectory suppDir;
    public CustomerDirectory custDir;
    
    public Admin() {
        super("", "", "Admin");
        suppDir = new SupplierDirectory();
        custDir = new CustomerDirectory();
    }

    public SupplierDirectory getSuppDir() {
        return suppDir;
    }

    public void setSuppDir(SupplierDirectory suppDir) {
        this.suppDir = suppDir;
    }

    public CustomerDirectory getCustDir() {
        return custDir;
    }

    public void setCustDir(CustomerDirectory custDir) {
        this.custDir = custDir;
    }
    
    @Override
    public boolean verify(String password){
        return password.equals(getPassword());
    }
    
}
