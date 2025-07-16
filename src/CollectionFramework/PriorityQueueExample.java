package CollectionFramework;

import java.util.*;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Banana");
        pq.add("Apple");
        pq.add("Cherry");
        System.out.println("Priority Queue : "+pq);
        System.out.println("Polling : "+pq.poll());
        System.out.println("After Polling : "+pq);
    }
}
