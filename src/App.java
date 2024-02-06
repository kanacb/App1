import lesson1.*;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        // System.out.println(args[0]);
        LocalDate ld = LocalDate.parse("1983-06-30");
        LocalDate nd = ld.plusMonths(8);
        System.out.println(nd);
        int year = nd.getYear();
        if(year % 4 == 0) System.out.println("is leap year");
        else System.out.println("is not leap year");
        // lesson2();
    }

    public static void lesson2() {
        int numberOfVessels = 15;
        int[] dimension = {2,4,7};
        IntegerHandler integerHandler = new IntegerHandler(numberOfVessels, dimension);
        int volume = integerHandler.getTotalVolume();
        String msg = integerHandler.toString();
        System.out.println(msg);
        System.out.println(volume);
    }

    public static void lesson1(){
        StringHandler stringHandler = new StringHandler("my class");
        System.out.println(stringHandler.toString());
        stringHandler.setStr("my new class");
        System.out.println(stringHandler.toString());
    }
}
