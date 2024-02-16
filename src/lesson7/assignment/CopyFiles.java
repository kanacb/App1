package lesson7.assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFiles extends ReadFileHandler {
    private String targetFileName;

    public CopyFiles(String sourceFileName, String targetFileName) {
        super(sourceFileName);
        this.targetFileName = targetFileName;
    }

    public void copyFile() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(super.getFilename()));
                FileWriter writer = new FileWriter(this.targetFileName)) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line + "\n");
            }
        }
    }
}