 package lesson11;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Lambda {
    static List<Integer> ary = Arrays.asList(1,2,3,4,5,6);
    static List<Integer> ary_filtered = new ArrayList<>();

    static void filter(){
        ary.forEach((a) -> 
            {
                if(a.equals(1)){
                    ary_filtered.add(a);
                }
            }
        );
    }


     public static void main(String[] args) {
        System.out.println("List of items in array");
        ary.forEach((a)-> System.out.println(a) );

        System.out.println();
        System.out.println("Filtered list of items");
        filter();
        ary_filtered.forEach((a)-> System.out.print(a) );

        // System.out.println("Sorted list of items");
        // ary_filtered.forEach((a)-> System.out.print(a) );


        // System.out.println("Mapped list of items");
        // ary_filtered.forEach((a)-> System.out.print(a) );

        // System.out.println("Reduced list of items");
        // ary_filtered.forEach((a)-> System.out.print(a) );
     }
}