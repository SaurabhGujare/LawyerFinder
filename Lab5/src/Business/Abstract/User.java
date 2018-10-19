package Business.Abstract;

/**
 *
 * @author Ninad, Akshay, Saurabh
 */
public abstract class User {
    private String password;
    private String userName;
    private final String role;

    public User(String password, String userName, String role) {
        this.password = password;
        this.userName = userName;
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    abstract public boolean verify(String password);

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return getUserName();
    }
    
}
