package CollectionFramework;

import java.util.*;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top : "+stack.peek());
        while(!stack.isEmpty()){
            System.out.println("Popped : "+stack.pop());
        }
    }
}
