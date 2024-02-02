public class Admin extends User {
    private String privileges;
    // Default constructor
    public Admin() {
        // Call the constructor of the superclass (User)
        super();
    }

    // Parameterized constructor
    public Admin(int id, String name, String password, int phoneNumber, int gender, boolean isLogin, String privileges) {
        // Call the parameterized constructor of the superclass (User)
        super(id, name, password, phoneNumber, gender, isLogin);
        this.privileges = privileges;
    }           

    // Getter for privileges
    public String getPrivileges() {
        return privileges;
    }

    // Setter for privileges
    public void setPrivileges(String privileges) {
        this.privileges = privileges;
    }
}
