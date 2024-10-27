import java.util.HashMap;
import java.util.Map;

public class MyMap<K, V> {
    private Map<K, V> map;

    public MyMap() {
        this.map = new HashMap<>();
    }

    public void put(K key, V value) {
        map.put(key, value);
    }

    public V get(K key) {
        return map.get(key);
    }

    public boolean containsKey(K key) {
        return map.containsKey(key);
    }

    public static void main(String[] args) {
        MyMap<String, Integer> myMap = new MyMap<>();
 
        myMap.put("five", 5);
        myMap.put("Two", 2);

        System.out.println("Value for 'five': " + myMap.get("five")); 
        System.out.println("Contains 'Three': " + myMap.containsKey("Three")); 
        System.out.println("Contains 'four': " + myMap.containsKey("four")); 
    }
}
