package lesson7.assignment;

import java.io.BufferedReader;
import java.io.IOException;

public class CountWords extends ReadFileHandler{
    
    public CountWords(String fileName) {
        super(fileName);
    }

    public int countWords(){
        int count = 0;
        try {
            ReadFile readFile = new ReadFile(super.getFilename());
            BufferedReader reader = readFile.readfileBuffer();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\s+");
                count += words.length;
            }
        } catch (IOException e) {
            System.err.println("Error in reading the file" + e.getMessage());
        }

        return count;
    }
}
