package lesson1;

public class IntegerHandler {
    private int x;
    private int[] a = { 1, 2, 3 };

    public IntegerHandler(int x, int[] a) {
        this.x = x;
        this.a = a;
    }

    private int getVolume(){
        return a[0] * a[1] * a[2];
    }

    public int getTotalVolume(){
        return x * getVolume();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }



}
