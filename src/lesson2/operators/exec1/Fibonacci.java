package lesson2.operators.exec1;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your start term: ");
        int f = scanner.nextInt();
        fibonacci(f);
        scanner.close();
    }

    static int fibonacci(int n) {
        int nextTerm = 0;
        int firstTerm = 0;
        int secondTerm = 1;

        for (int i = 0; i <= n; i++) {
            System.out.print(firstTerm + " ");
            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        return nextTerm;
    }
}
