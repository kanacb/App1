package quiz2.question14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class Test {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("James", 25, 15000));
        list.add(new Employee("Lucy", 23, 15000));
        list.add(new Employee("Bill", 27, 15000));
        list.add(new Employee("Jack", 19, 15000));
        list.add(new Employee("Liya", 20, 15000));

        process(list, e -> e.getAge() > 20);

    }

    private static void process(List<Employee> list, Predicate<Employee> preidcate) {
        Iterator<Employee> iterator = list.iterator();
        while (iterator.hasNext()) {
            Employee e = iterator.next();
            if (preidcate.test(e)) {
                System.out.println(e + " ");
            }
        }
    }
}