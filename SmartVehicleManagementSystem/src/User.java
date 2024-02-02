public class User {
    private int id;
    private String name;
    private String password;
    private int phoneNumber;
    private int gender;
    private boolean isLogin;

    // Default constructor
    public User() {}

    // Parameterized constructor
    public User(int id, String name, String password, int phoneNumber, int gender, boolean isLogin) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.isLogin = isLogin;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getGender() {
        return gender;
    }

    public boolean isLogin() {
        return isLogin;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public void setLogin(boolean isLogin) {
        this.isLogin = isLogin;
    }
}
