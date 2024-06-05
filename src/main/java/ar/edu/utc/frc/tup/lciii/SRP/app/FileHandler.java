package ar.edu.utc.frc.tup.lciii.SRP.app;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public abstract class FileHandler {
    protected String filePath;

    public FileHandler(String filePath) {
        this.filePath = filePath;
    }
}
