package Business.Users;

import Business.Abstract.User;
import java.util.Date;

/**
 *
 * @author Ninad, Akshay, Saurabh
 */
public class Customer extends User {
    private Date dateCreated;

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    
    public Customer(String password, String userName) {
        super(password, userName,"CUSTOMER");
        dateCreated = new Date();
    }

    @Override
    public boolean verify(String password) {
        return password.equals(getPassword());
    }
}
