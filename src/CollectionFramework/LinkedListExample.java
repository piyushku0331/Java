package CollectionFramework;

import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Mango");
        list.add("Pineapple");
        System.out.println("Linked List : "+list);
        list.removeFirst();
        System.out.println("After removing First : "+list);
    }
}
