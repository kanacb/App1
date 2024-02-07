package lesson2.operators.exec1;

public class exec2 {
    static double d;
    static double xoff;
    static double yoff;
    static double zoff;
    static int x1 = 2;
    static int y1 = 1;
    static int z1 = 3;
    static int x2 = 0;
    static int y2 = 0;
    static int z2 = 6;

    public static void main(String[] args) {
        xoff = Math.pow(x1 - x2, 2);
        yoff = Math.pow(y1 - y2, 2);
        zoff = Math.pow(z1 - z2, 2);
        d = Math.sqrt(xoff + yoff + zoff);
        System.out.println(d);
        mathTest();
        floatingPointError();
    }

    static void mathTest() {
        double a = 2.8, b = 3.1, c = 6.0;
        System.out.println("a+b \t\t= " + (a + b));
        System.out.println("|a| \t\t= " + Math.abs(a));
        System.out.println("round(a) \t= " + Math.round(a));
        System.out.println("ceil(a) \t= " + Math.ceil(a));
        System.out.println("floor(a) \t= " + Math.floor(a));
        System.out.println("exp(a) \t\t= " + Math.exp(a));
        System.out.println("max of a and b \t= " + Math.max(a, b));
        System.out.println("min of a and b \t= " + Math.min(a, b));
        System.out.println("2^c \t\t= " + Math.pow(2, c));
    }

    static void floatingPointError() {
        double d = 0.0;
        double increment = 0.1;
        System.out.println("Original d \t\t=" + d);
        d += increment;
        System.out.println("d + 1 increments \t=" + d);
        d += increment;
        System.out.println("d + 2 increments \t=" + d);
        d += increment;
        System.out.println("d + 3 increments \t=" + d);
        d += increment;
        System.out.println("d + 4 increments \t=" + d);
        d += increment;
        System.out.println("d + 5 increments \t=" + d);
        d += increment;
        System.out.println("d + 6 increments \t=" + d);
        d += increment;
        System.out.println("d + 7 increments \t=" + d);
        d += increment;
        System.out.println("d + 8 increments \t=" + d);
        d += increment;
        System.out.println("d + 9 increments \t=" + d);
        d += increment;
        System.out.print("d + 10 increments \t=" + d);
    }

}
