package com.directi.training.dip.exercice_refactored;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileDataReader implements DataReader {
    private final String filePath;

    public FileDataReader(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String readData() throws IOException {
        try (Reader reader = new BufferedReader(new FileReader(filePath))) {
            StringBuilder data = new StringBuilder();

            int c;

            while ((c = reader.read()) != -1) {
                data.append((char) c);
            }

            return data.toString();
        }
    }
}
