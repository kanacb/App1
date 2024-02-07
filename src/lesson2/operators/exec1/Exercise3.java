package lesson2.operators.exec1;

public class Exercise3 {
    public static void main(String[] args) {
        String str = "qwertyuiopasdfghjklzxcvbnm";
        String search = "fghjkl";
        System.out.println(str);
        System.out.println(str.concat(str));
        str = str.concat(str);
        System.out.println(str);
        System.out.println(str.charAt(4));
        System.out.println(str.length());
        if(str.contains(search)){
            System.out.printf("Contains %s", search);
        }
        else {
            System.out.printf("Does not cntain %s", search);
        }
    }
}
