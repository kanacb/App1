package lesson7.assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile extends ReadFileHandler {

    public WriteFile(String fileName) {
        super(fileName);
    }

    public String write(String input) {
        String response = "";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(super.getFilename()))) {
            writer.write(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }


}
