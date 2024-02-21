package quiz3.question60.question69;

import java.io.IOException;

class Super {
    Super() throws RuntimeException {
        System.out.println("CARPE");
    }
}

class Sub extends Super {
    Sub() throws IOException {
        System.out.println("DIEM");
    }
}

/**
 * Test
 */
public class Test {
    public static void main(String[] args) throws IOException {
        new Sub();
    }
}