import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        System.out.println(hm);
        hm.put(101, "ajay");
        hm.put(102, "vijay");
        hm.put(103, "suri");
        System.out.println(hm);

        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey());
            System.out.println(m.getValue());
            System.out.println(m.getKey() + "" + m.getValue());
        }

        hm.putIfAbsent(104, "kamesh");
        System.out.println(hm);
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + "" + m.getValue());
        }
        HashMap<Integer, String> map = new HashMap<>();
        map.put(105, "vamsi");
        map.putAll(hm);
        System.out.println(map);
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + "" + m.getValue());
        }
    }
}
