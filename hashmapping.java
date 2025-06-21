import java.util.HashMap;
import java.util.HashSet;

public class hashmapping {
    public static void main(String[] args) {
        // HashMap<String, Integer> map = new HashMap<>();
        // map.put("Hello", 1);
        // map.put("Hi", 3);
        // map.put("Goodbye", 2);
        // System.out.println(map.get("Hi"));
        // System.out.println(map.getOrDefault("Bleeh", 4));

        // HashMap<Integer> map = new HashMap<>();
        HashSet<Integer> map = new HashSet<>();
        map.add(1);
        map.add(2);
        map.add(3);
        map.add(4);
        map.add(2);
        System.out.println(map);
    }
}
