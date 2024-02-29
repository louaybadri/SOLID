package com.directi.training.dip.exercice_refactored;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;


public class NetworkDataReader implements DataReader {
    private final URL url;

    public NetworkDataReader(URL url) {
        this.url = url;
    }

    @Override
    public String readData() throws IOException {
        try (InputStream in = url.openStream();
                InputStreamReader reader = new InputStreamReader(in)) {
            StringBuilder data = new StringBuilder();

            int c;

            while ((c = reader.read()) != -1) {
                data.append((char) c);
            }

            return data.toString();
        }
    }
}
