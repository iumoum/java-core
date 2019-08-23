package javacore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Marine {
    private String name;
    private int age;

    public Marine(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Marine{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Marine> marines = new ArrayList<>();

        marines.add(new Marine("Kim Jangsung", 26));
        marines.add(new Marine("Kim Jiwan", 27));
        marines.add(new Marine("Song Inseok", 24));

        Collections.sort(marines, (o1, o2) -> {
            return o1.getAge() - o2.getAge();
        });

        marines.forEach(System.out::println);
    }
}
