package reza.minang.hackafarm;

/**
 * Created by Reza on 10/11/2016.
 */
public class User {

    public String username;
    public String email;
    public String Password;

    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

}
