package lesson3;

import java.io.*;

public class GetUserName {

    public static void main(String[] args) throws IOException {
        String firstname, lastname;
        BufferedReader stdin = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.print("Please enter your firstname:");
        firstname = stdin.readLine();
        System.out.print("Please enter your lastname:");
        lastname = stdin.readLine();
        System.out.println("-----------------------------");
        System.out.println("Hello " + firstname + " " + lastname);
        System.out.println("-----------------------------");
    }
}
