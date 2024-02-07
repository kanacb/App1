package lesson2.operators.exec1;

import java.util.Scanner;

public class SwichCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day abbr: ");
        String str = scanner.nextLine();
        System.out.println("switch: " + switchCase(str));
        scanner.close();
    }

    static String switchCase(String day) {
        String ret = "";
        switch (day) {
            case "m": case "mon": case "md" :
                if (day.contains("md")){
                    ret = "day Monday";
                }
                else ret = "Monday";
                break;
            case "tu":
                ret = "Tuesday";
                break;
            case "w":
                ret = "Wednesday";
                break;
            case "th":
                ret = "Thursday";
                break;
            default:
                ret = "Undefined";
                break;
        }

        return ret;

    }

}
