package com.directi.training.dip.exercice_refactored;

import java.io.IOException;
import java.net.URL;

public class EncodingModuleClient {
        public static void main(String[] args) throws IOException {

                DataReader fileDataReader = new FileDataReader(
                                "DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt");

                DataWriter fileDataWriter = new FileDataWriter(
                                "DIP/src/com/directi/training/dip/exercise/afterEncryption.txt");

                EncodingModule encodingModule = new EncodingModule();
                encodingModule.encode(fileDataReader, fileDataWriter);


                URL url;
                url = new URL("http", "myfirstappwith.appspot.com", "/index.html");
                IDatabase database = new MyDatabase();

                DataReader networkDataReader = new NetworkDataReader(url);
                DataWriter databaseWriter = new DatabaseWriter(database);

                encodingModule.encode(networkDataReader, databaseWriter);
        }
}
