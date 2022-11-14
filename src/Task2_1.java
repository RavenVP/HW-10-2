import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task2_1 {
    private static final Map<String, List<Integer>> map1 = new HashMap<>();
    private static final Map<String, Integer> map2 = new HashMap<>();

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        Integer sum1 = 0;

        for (int i = 0; i < 3; i++) {
            list1.add((int) (Math.random() * 1000));
            list2.add((int) (Math.random() * 1000));
            list3.add((int) (Math.random() * 1000));
        }
        map1.put("l1",list1);
        map1.put("l2",list2);
        map1.put("l3",list3);

        System.out.println(map1);

        for (var s : map1.keySet()) {
            List<Integer> newList = map1.get(s);
            for (Integer sum2 : newList) {
                sum1 += sum2;
            }
            map2.put(s, sum1);
        }
        System.out.println(map2);
    }
}
