import java.util.HashSet;
import java.util.Iterator;

public class hashset {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("ajay");
        set.add("madhu");
        set.add("hari");
        set.add("sai");
        set.add("yash");
        System.out.println(set);

        HashSet<String> set1 = new HashSet<>();
        set.add("raju");
        set.add("ramu");
        set.addAll(set1);
        System.out.println("UpdatedList:" + set);
        set.remove("madhu");
        System.out.println("UpdatedList:" + set);

        Iterator<String> i = set1.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        HashSet<String> set2 = new HashSet<>();
        set2.add("manu");
        set1.addAll(set2);
        System.out.println("UpdatedList:" + set + set1);
    }
}
