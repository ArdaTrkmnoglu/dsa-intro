package dsa_intro.DSA_files;
import java.util.LinkedList;

public class linkedLists {
    public static void main(String[] args) {
        
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("E");

        linkedList.add(4, "F");
        linkedList.remove("E");

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());

        linkedList.addFirst("0");
        linkedList.addLast("G");

        System.out.println(linkedList);

    }
}
