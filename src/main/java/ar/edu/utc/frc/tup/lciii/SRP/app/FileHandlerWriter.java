package ar.edu.utc.frc.tup.lciii.SRP.app;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlerWriter extends FileHandler {

    public FileHandlerWriter(String filePath) {
        super(filePath);
    }

    public void writeToFile(String data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(data);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
