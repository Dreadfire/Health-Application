package model;

public class Account {
    private String username;
    private String password;
    protected String userRole;

    public Account(String username, String password)
    {
        this.username = username;
        this.password = password;
        this.userRole = "user";
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getUserRole() {
        return userRole;
    }


    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", userRole='" + userRole + '\'' +
                '}';
    }
}
