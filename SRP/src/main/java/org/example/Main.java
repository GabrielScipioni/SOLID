package org.example;

public class Main {
    static final String PATH = "src/main/java/org/example/Users.txt";
    public static void main(String[] args) {

        while (true) {
            FileHandlerWriter fileHandlerWriter = new FileHandlerWriter(PATH);
            FileHandlerReader fileHandlerReader = new FileHandlerReader(PATH);
            UserRepository userRepository = new UserRepository(fileHandlerWriter, fileHandlerReader);
            UserValidator userValidator = new UserValidator(userRepository);
            UserInteraction userController = new UserInteraction(userRepository, userValidator);
            userController.registerUser();
        }
    }
}
