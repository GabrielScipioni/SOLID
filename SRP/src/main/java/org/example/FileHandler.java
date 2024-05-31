package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public abstract class FileHandler {
    protected String filePath;

    public FileHandler(String filePath) {
        this.filePath = filePath;
    }
}
