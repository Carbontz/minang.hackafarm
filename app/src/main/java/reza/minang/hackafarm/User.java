package reza.minang.hackafarm;

/**
 * Created by Reza on 10/11/2016.
 */
class User {

    private String username;
    private String email;
    public String Password;

    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    User(String username, String email) {
        this.username = username;
        this.email = email;
    }

}
