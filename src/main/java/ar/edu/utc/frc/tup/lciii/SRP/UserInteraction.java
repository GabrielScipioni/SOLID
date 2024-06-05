package ar.edu.utc.frc.tup.lciii.SRP;
import java.util.Scanner;

/**
 * esta clase interactua con el usuario a registrar
 */
public class UserInteraction {
    private UserRepository userRepository;
    private UserValidator userValidator;

    public UserInteraction(UserRepository userRepository, UserValidator userValidator) {
        this.userRepository = userRepository;
        this.userValidator = userValidator;
    }

    /**
     * <h3>Registra un nuevo usuario en el sistema.</h3>
     * <p>
     * Este método solicita al usuario que ingrese un nombre de usuario y una contraseña.
     * Si el nombre de usuario ya existe, se informa al usuario. Si no, se guarda el nuevo usuario
     * en el repositorio.
     * </p>
     */
    public void registerUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        if (userValidator.userExists(username)) {
            System.out.println("User already exists.");
        } else {
            System.out.print("Enter password: ");
            String password = scanner.nextLine();
            User user = new User(username, password);
            userRepository.saveUser(user);
            System.out.println("User registered successfully.");
        }
    }
}
