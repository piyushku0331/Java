package CollectionFramework;

import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        System.out.println("Queue : "+queue);
        System.out.println("Peek : "+queue.peek());
        System.out.println("Polled : "+queue.poll());
        System.out.println("Queue after poll : "+queue);
    }
}
