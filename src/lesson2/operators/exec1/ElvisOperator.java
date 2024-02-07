package lesson2.operators.exec1;

import java.io.IOException;
import java.util.Scanner;

public class ElvisOperator {
    public static void main(String[] args) {
        int intA = 12;
        int intB = 14;
        Scanner scanner = new Scanner(System.in);

        int highest = (intA > intB) ? (intA < 15) ? 15 : 20 : intB;

        System.out.println("Enter int A:");
        intA = scanner.nextInt();
        System.out.println("Enter int B:");
        intB = scanner.nextInt();
        scanner.close();
        System.out.println(highest);
    }
}
