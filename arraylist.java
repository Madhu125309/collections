import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add("madhu");
        al.add("45000.00");
        System.out.println(al);

        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(101);
        a.add(102);
        a.add(103);
        a.add(104);
        System.out.println(a);
        for (int i = 0; i < al.size() + 10; i++) {
            System.out.println(i);
        }

        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("madhu");
        a1.add("sai");
        a1.add("dhanu");
        a1.add("yash");

        Collections.sort(a1);

        for (String ename : a1) {
            System.out.println(ename);
        }
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        int[] madhu = { 2, 4, 6, 8, 10 };
        int b = 0;
        while (b < madhu.length) {
            System.out.println(madhu[b]);
            b++;
        }
    }
}
