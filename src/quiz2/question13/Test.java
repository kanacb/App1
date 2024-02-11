package quiz2.question13;

import java.io.FileNotFoundException;
import java.io.IOException;

abstract class Super {
    public abstract void m1() throws IOException;
}

class Sub extends Super {
    @Override
    public void m1() throws IOException {
        throw new FileNotFoundException();
    }
}

public class Test {
    public static void main(String[] args) {
        Super s = new Sub();

        try {
            s.m1();
            ;
        } catch (FileNotFoundException e) {
            System.out.println("B");
        } catch (IOException e) {
            System.out.println("A");
        }
        // catch (FileNotFoundException e) {
        //     System.out.println("B");
        // } 
        finally {
            System.out.println("C");
        }
    }
}
