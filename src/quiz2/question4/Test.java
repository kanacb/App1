package quiz2.question4;

import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        String[] arr = { "A", "ab", "bab", "Aa" };
        Predicate<String> func = p -> true;
        Predicate<String> func2 = g -> g == "A";
        processStringArray(arr, func, func2);
    }

    public static void processStringArray(String[] arr, 
        Predicate<String> predicate, Predicate<String> predicate2) {
        for (String str : arr) {
            if (predicate.test(str)) {
                System.out.println(str);
            }
            if (predicate2.test(str)) {
                System.out.println(str);
            }
        }
    }
}
