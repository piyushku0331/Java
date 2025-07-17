package CollectionFramework;

import java.util.*;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>();
        dq.addFirst("Start");
        dq.addLast("Middle");
        dq.addLast("End");
        System.out.println("Deque contents : "+dq);
        System.out.println("Head : "+dq.peekFirst());
        System.out.println("Tail : "+dq.peekLast());
        dq.pollFirst();
        dq.pollLast();
        System.out.println("After Removal : "+dq);
    }
}
