package ar.edu.utc.frc.tup.lciii.SRP.app;
import java.util.List;

public class UserValidator {
    private UserRepository repository;

    public UserValidator(UserRepository repository) {
        this.repository = repository;
    }

    public boolean userExists(String username) {
        List<User> users = repository.getAllUsers();
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }
}
