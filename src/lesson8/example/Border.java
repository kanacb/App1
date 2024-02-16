package lesson8.example;

abstract class Border {

    public int border() {
        return 2;
    }

    public double border(int thickness) {
        return Math.pow(thickness, 2.0);
    }

}
