package lesson2.operators.exec1;

import java.time.LocalDateTime;
import java.util.Scanner;

public class MatrixAdd {

// n = 100
// sum of 1 to n
// sum = 1 + 2 + 3 ... 100

// 0   +   1 +   2 +   3 ...  +  47 +  48 +  49       50 
// 100 +  99 +  98 +  97 ...  +  53 +  52 +  51
// 100 + 100 + 100 + 100 ...  + 100 + 100 + 100  => 100 * 50 + 50 => 50(100 + 1)

// n = 100 => n/2(n+1)


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your last value to sum: ");
        long n = scanner.nextLong();
        long start1 = System.currentTimeMillis();
        System.out.println("matrix: " + matrix(n));
        long end1 = System.currentTimeMillis();
        float secMatrix = (end1 - start1) / 1000F;
        System.out.println("verify: " + verify(n));
        long end2 = System.currentTimeMillis();
        float secLoop = (end2 - end1) / 1000F;
        System.out.println("secMatrix: " + secMatrix + ", secLoop: " + secLoop);
        scanner.close();
    }

    static long verify(long n){
        long f = 0;
        for(int i=0;i<=n;i++) f +=i;
        return f;
    }

    static long matrix(long n){
        return (n/2)*(n+1);
    }
}
