package lesson3;

import java.util.Arrays;

public class SelectionSort {
    static double[] array1 = { 8.0, -2.5, -5.0, 1.0, 9.0 };

    public static void main(String[] args) {
        selectionSort(array1, false);
        System.out.println(Arrays.toString(array1));
    }

    public static void selectionSort(double[] d, boolean inc) {
        int idxToSwap, len = d.length;
        double temp;
        for (int i = 0; i <= (len - 1); i++) {
            int k = i==0 ? 0 : i - 1;
            if (inc) {
                idxToSwap = findMinIdx(d, k);
            }
            else {
                idxToSwap = findMaxIdx(d, k);
            }
            temp = d[idxToSwap];
            d[idxToSwap] = d[k];
            d[k] = temp;
        }
    }

    public static int findMinIdx(double[] d, int k) {
        int minIdx = k;
        for (int i = k + 1; i < d.length; i++) {
            if (d[i] < d[minIdx]) {
                minIdx = i;
            }
        }
        return minIdx;
    }

    public static int findMaxIdx(double[] d, int k) {
        int maxIdx = k;
        for (int i = k + 1; i < d.length; i++) {
            if (d[i] > d[maxIdx]) {
                maxIdx = i;
            }

        }
        return maxIdx;
    }

}
