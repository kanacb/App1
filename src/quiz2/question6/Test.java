package quiz2.question6;

public class Test {
    public static void main(String[] args) {
        CharSequence chaSeq = "char";
        String iStr = new String("asdfasdf");
        m1(chaSeq);
        m1(null);
        m1("String");
        m1('a');
    }

    static void m1(CharSequence s){
        System.out.println("CharSequence");
    }

    static void m1(String s){
        System.out.println("String");
    }

    static void m1(Object s){
        System.out.println("Object");
    }
}
