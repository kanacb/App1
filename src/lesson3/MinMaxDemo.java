package lesson3;

public class MinMaxDemo {
    public static void main(String[] args) {
        int[] a = { -128, 65, -235, 99, 0, 26 };
        int minIdx = findMinIdx(a);
        int maxIdx = findMaxIdx(a);
        System.out.println("min value is a[" + minIdx + "]=" + a[minIdx]);
        System.out.println("max value is a[" + maxIdx + "]=" + a[maxIdx]);
    }

    public static int findMinIdx(int[] a) {
        int k, minIdx = 0;
        for (k = 1; k < a.length; k++) {
            if (a[k] < a[minIdx])
                minIdx = k;
        }
        return minIdx;
    }

    public static int findMaxIdx(int[] a) {
        int k, maxIdx = 0;
        for (k = 1; k < a.length; k++) {
            if (a[k] > a[maxIdx])
                maxIdx = k;
        }
        return maxIdx;
    }
}
