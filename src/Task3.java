import java.util.HashMap;

public class Task3 {
    static HashMap<String, Integer> map2 = new HashMap<>();

    public static void addToMap3(String addableKey, Integer addableValue) {
        if (map2.containsKey(addableKey) && map2.get(addableKey).equals(addableValue)) {
            throw new RuntimeException("Уже есть");
        }
        map2.put(addableKey, addableValue);

    }
}
