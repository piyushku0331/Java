package PracticeForSt1;

import java.util.*;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        Stack<Integer> auxStack = new Stack<>();
       while(!stack.isEmpty()){
           auxStack.add(stack.pop());
       }
        System.out.println(auxStack);
    }
}
