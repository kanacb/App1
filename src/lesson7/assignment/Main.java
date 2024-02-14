package lesson7.assignment;

import java.io.BufferedReader;

public class Main {
    static String filename = "file.txt";

    public static void main(String[] args) {
        // Readfile & print the file
        ReadFile readFile = new ReadFile(filename);
        readFile.printFile();
        // Count words
        CountWords countWords = new CountWords(filename);
        int count = countWords.countWords();
        System.out.println("Length of words: " + count);
        // Write File
        WriteFile writeFile = new WriteFile(filename);
        writeFile.write("Write some text \n Write some more text");
        readFile.printFile();

    }
}
