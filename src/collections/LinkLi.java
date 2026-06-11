package collections;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LinkLi {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("alok",10);
        map.put("Deepak",11);

        System.out.println(map.keySet());
        System.out.println(map.containsValue(10));
        System.out.println(map.values());
        System.out.println(map.entrySet());

    }
}
