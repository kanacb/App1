package lesson7.assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebScrapper {
    public static void main(String[] args) {
        String url = "https://example.com"; // URL of the webpage to scrape
        String outputFile = "output.txt"; // Output file to write the extracted data

        try {
            // Fetch HTML content of the webpage
            String htmlContent = fetchWebpageContent(url);

            // Extract specific data using regular expressions
            String extractedData = extractData(htmlContent);

            // Write the extracted data to a text file
            writeToFile(outputFile, extractedData);

            System.out.println("Data extraction completed. Check " + outputFile + " for results.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to fetch HTML content of a webpage
    private static String fetchWebpageContent(String urlString) throws IOException {
        @SuppressWarnings("deprecation")
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder content = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            content.append(line);
        }
        reader.close();

        return content.toString();
    }

    // Method to extract specific data from HTML content using regular expressions
    private static String extractData(String htmlContent) {
        StringBuilder extractedData = new StringBuilder();

        // Define your regular expression to extract data here
        Pattern pattern = Pattern.compile("<h1>(.*?)</h1>");
        Matcher matcher = pattern.matcher(htmlContent);

        while (matcher.find()) {
            extractedData.append(matcher.group(1)).append("\n");
        }

        return extractedData.toString();
    }

    // Method to write data to a text file
    private static void writeToFile(String filename, String data) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(data);
        }
    }
}
