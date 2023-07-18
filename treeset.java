import java.util.Iterator;
import java.util.TreeSet;

public class treeset {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");
        set.add("f");
        set.remove("e");
        System.out.println(set);
        System.out.println("initialset:" + set);
        System.out.println("reverseset:" + set.descendingSet());
        System.out.println("headset:" + set.headSet("a", true));
        System.out.println("subset:" + set.subSet("a", false, "e", true));
        System.out.println("tailset:" + set.tailSet("c", false));
        System.out.println(set);
        Iterator<String> i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        TreeSet<String> set2 = new TreeSet<>();
        set.removeAll(set);
        System.out.println("UpdatedList:" + set);
    }
}
