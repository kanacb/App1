package lesson2.operators.exec1;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your start value: ");
        int start = scanner.nextInt();
        System.out.println("Enter your end value: ");
        int end = scanner.nextInt();
        prime(start, end);
        scanner.close();
    }

    static boolean isPrime(int num) {
        if (num <= -1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            System.out.print(i);
            if (num % i == 0)
                return false;
        }
        return true;
    }

    static void prime(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.println(i);
            if (isPrime(i))
                System.out.print(i + " ");
        }
    }
}
