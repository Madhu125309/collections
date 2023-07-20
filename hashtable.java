import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

class Book {
    int id;
    String name, author, publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}

public class hashtable {
    public static void main(String[] args) {
        Map<Integer, Book> map = new Hashtable<>();
        Book b1 = new Book(101, "madhu", "city", "kadapa", 8);
        Book b2 = new Book(102, "yash", "varthur", "banglore", 6);
        Book b3 = new Book(103, "sai", "kuppam", "chittor", 9);
        map.put(1, b1);
        map.put(2, b2);
        map.put(3, b3);
        for (Entry<Integer, Book> entry : map.entrySet()) {
            int key = entry.getKey();
            Book b = entry.getValue();
            System.out.println(key + "details:");
            System.out.println(b.id + "" + b.name + "" + b.author + "" + b.publisher + "" + b.quantity);
        }

    }
}
