import java.util.HashMap;
import java.util.LinkedHashMap;

public class Task2_2 {
    static HashMap<String, Integer> map4 = new LinkedHashMap<>();

    public static void printLinkedMap4() {
        map4.put("123", 11);
        map4.put("321", 22);
        map4.put("234", 14);
        map4.put("432", 15);
        map4.put("345", 17);
        map4.put("543", 12);
        map4.put("456", 17);
        map4.put("654", 11);
        map4.put("567", 17);
        map4.put("765", 18);
        System.out.println(map4);
    }
}
