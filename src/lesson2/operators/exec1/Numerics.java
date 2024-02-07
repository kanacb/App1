package lesson2.operators.exec1;

public class Numerics {
    public static void main(String[] args) {
        int intValue = 10;
        double doubleValue = 32.19;

        double castedDoubleValue = (double) intValue;
        System.out.printf("Casted value from int to double %f", castedDoubleValue);

        int castedIntValue = (int) doubleValue;
        System.out.printf("Casted value from double to int %d", castedIntValue);

    }
}
