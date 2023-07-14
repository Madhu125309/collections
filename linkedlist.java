import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> li = new LinkedList<Integer>();
        li.add(10);
        li.add(20);
        li.add(30);
        System.out.println(li);
        LinkedList<String> l = new LinkedList<String>();
        l.add("madhu");
        l.add("yash");
        l.add("sai");
        System.out.println(l);
        l.remove("sai");
        System.out.println(l);
        l.removeAll(l);
        System.out.println(l);
    }
}
