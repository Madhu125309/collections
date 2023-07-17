import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedhashset {
    public static void main(String[] args) {
        LinkedHashSet<String> list = new LinkedHashSet<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println(list);

        Iterator<String> i = list.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        LinkedHashSet<String> list1 = new LinkedHashSet<String>();
        list1.add("f");
        list1.add("g");
        list1.addAll(list);
        System.out.println("updatedList:" + list1);

    }
}
