package lesson7.assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFile extends ReadFileHandler {

    private String filename;

    public ReadFile(String fileName) {
        super(fileName);
    }

    public void printFile() {
        ReadFile readFile = new ReadFile(super.getFilename());
        try (BufferedReader reader = readFile.readfileBuffer()) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error in reading the file" + e.getMessage());
        }
    }

    public BufferedReader readfileBuffer(){
        BufferedReader reader = null;
        Path filePath = Paths.get(super.getFilename());
        try {
            reader = new BufferedReader(new FileReader(filePath.toString()));
        } catch (IOException e) {
            System.err.println("Error in reading the file" + e.getMessage());
        }
        return reader;
    }

}
