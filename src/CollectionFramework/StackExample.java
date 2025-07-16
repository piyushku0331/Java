package CollectionFramework;

import java.util.*;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println("Top : "+stack.peek());
        while(!stack.isEmpty()){
            System.out.println("Popped : "+stack.pop());
        }
    }
}
