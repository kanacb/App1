
package lesson13;

interface Rideable {
    void ride(String name);
}

class Animal {
}

class Horse extends Animal implements Rideable {
    public void ride(String name) {
        System.out.println(name.toUpperCase() + " IS RIDING THE HORSE");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal horse = new Horse();

        ((Rideable) horse).ride("Kana");
    }
}
