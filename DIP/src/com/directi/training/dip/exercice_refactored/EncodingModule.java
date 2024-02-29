package com.directi.training.dip.exercice_refactored;

import java.io.IOException;
import java.util.Base64;

public class EncodingModule {
    public void encode(DataReader dataReader, DataWriter dataWriter) throws IOException {
        String data = dataReader.readData();
        String encodedData = Base64.getEncoder().encodeToString(data.getBytes());
        dataWriter.writeData(encodedData);
    }
}
