package com.directi.training.dip.exercice_refactored;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileDataWriter implements DataWriter {
    private final String filePath;

    public FileDataWriter(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void writeData(String data) throws IOException {
        try (Writer writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(data);
        }
    }
}
