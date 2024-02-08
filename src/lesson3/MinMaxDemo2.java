package lesson3;

public class MinMaxDemo2 {
    public static void main(String[] args) {
        int[] a = { -128, 65, -235, 99, 0, 26 };
        int[] idx = new int[2];
        idx = findMinMaxIdx(a);
        System.out.println("min value is a[" + idx[0] + "]=" + a[idx[0]]);
        System.out.println("max value is a[" + idx[1] + "]=" + a[idx[1]]);
    }

    public static int[] findMinMaxIdx(int[] a) {
        int k, minIdx = 0, maxIdx = 0;
        for (k = 1; k < a.length; k++) {
            if (a[k] < a[minIdx])
                minIdx = k;
            if (a[k] > a[maxIdx])
                maxIdx = k;
        }
        int[] idx = { minIdx, maxIdx };
        return idx;
    }
}
