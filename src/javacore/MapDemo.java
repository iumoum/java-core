package javacore;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();

        m.put("name", "Jiwan");
        m.put("age", "27");

        Set<String> keySet = m.keySet();

        for(String key : keySet){
            System.out.println(key + ": " + m.get(key));
        }
    }
}
