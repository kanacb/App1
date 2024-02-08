package lesson3;

import java.util.Arrays;

public class GenRandomArray {
    public static void main(String[] args) {
        int len = 10;
        int min = 0;
        int max = 99;
        int[] randoms = genRandomIntArray(len, min, max);
        System.out.println(Arrays.toString(randoms));
    }

    public static int[] genRandomIntArray(
            int length, int min, int max) {
        int[] a = new int[length];
        for (int i = 0; i < length; i++) {
            a[i] = (int) Math.round(Math.random() * (max - min) + min);
        }
        return a;
    }
}
