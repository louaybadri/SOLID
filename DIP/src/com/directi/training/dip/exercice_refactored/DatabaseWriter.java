package com.directi.training.dip.exercice_refactored;

public class DatabaseWriter implements DataWriter {
    private final IDatabase database;

    public DatabaseWriter(IDatabase database) {
        this.database = database;
    }

    @Override
    public void writeData(String data) {
        database.write(data);
    }
}
