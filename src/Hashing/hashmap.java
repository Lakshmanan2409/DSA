package Hashing;

import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("a",65);
        map.put("b",66);
        map.put("c",67);
        map.put("d",68);
        map.put("d",68);
        map.put("e",69);
        System.out.println(map.containsValue(65));
        System.out.println(map.get("d"));
        System.out.println(map);

        map.containsKey("a");
        map.containsValue(65);
        map.replace("a",60);

        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println(e);
        }
    }
}
