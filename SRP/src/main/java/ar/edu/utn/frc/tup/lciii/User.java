package ar.edu.utn.frc.tup.lciii;

/**
 * Clase encargada de representar la información del usuario
 */
public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return username + "," + password;
    }
}

