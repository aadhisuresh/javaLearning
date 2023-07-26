package Hashmap;

import java.util.HashMap;

public class Hashmap_Introduction {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(1, 20);
        map.put(2,30);
        map.put(45, 50);

        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        map.put(1, 40);
        System.out.println(map);
        map.clear();
        System.out.println(map.isEmpty());

        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "House");
        map1.put(2, "Touse");
        map1.put(3, "Jouse");
        System.out.println(map1);

        HashMap<String, String> map2 = new HashMap<>();
        map2.put("One", "House");
        map2.put("Two", "Touse");
        map2.put("Three", "Jouse");
        System.out.println(map2);
    }
}
