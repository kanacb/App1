package lesson2.operators.exec1;

import java.util.Scanner;

public class FlowStatement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter int A:");
        int intA = scanner.nextInt();

        System.out.println("Enter int B:");
        int intB = scanner.nextInt();

        System.out.println("Enter int C:");
        int intC = scanner.nextInt();

        System.out.println(BloC(intA, intB, intC));

        scanner.close();

    }

    public static int BloC(int a, int b, int c) {
        int m = 0;
        m = (a <= b) ? b : a;
        m = (m >= c) ? m : c;
        return m;
    }
}
