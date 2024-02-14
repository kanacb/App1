package lesson7.example3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketExample {
    
    public static void main(String[] args) {
        String serverAddress = "https://oil-futures.apps.uat.codebridge.live";
        int port = 443;

        try{
            Socket socket = new Socket(serverAddress, port);
            OutputStream outputStream = socket.getOutputStream();
            InputStream inputStream = socket.getInputStream();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            PrintWriter printWriter = new PrintWriter(outputStream, true);

            printWriter.println("Hello, server is responding");

            String reader = bufferedReader.readLine();
            System.out.println("Server read: " + reader);

            printWriter.close();
            bufferedReader.close();
            socket.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
