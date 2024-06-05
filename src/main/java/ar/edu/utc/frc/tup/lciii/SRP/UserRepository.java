package ar.edu.utc.frc.tup.lciii.SRP;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private FileHandlerWriter fileHandlerWriter;
    private FileHandlerReader fileHandlerReader;

    public UserRepository(FileHandlerWriter fileHandlerWriter, FileHandlerReader fileHandlerReader) {
        this.fileHandlerWriter = fileHandlerWriter;
        this.fileHandlerReader = fileHandlerReader;
    }

    public void saveUser(User user) {
        fileHandlerWriter.writeToFile(user.toString());
    }

    public List<User> getAllUsers() {
        List<String> lines = fileHandlerReader.readFromFile();
        List<User> users = new ArrayList<>();
        for (String line : lines) {
            String[] parts = line.split(",");
            if (parts.length == 2) {
                users.add(new User(parts[0], parts[1]));
            }
        }
        return users;
    }
}
