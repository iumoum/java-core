package javacore;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> values = new TreeSet<>();

        System.out.println(values.add(6));
        System.out.println(values.add(9));
        System.out.println(values.add(6));          // 이미 있는 값이기 때문에 false를 리턴하며, 컬렉션에 저장하지 않는다.
        System.out.println(values.add(5));

        values.forEach(System.out::println);
    }
}
