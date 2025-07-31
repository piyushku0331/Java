package PracticeForSt1;

import java.util.*;

public class StringReverseUsingStack {
    public static void main(String[] args) {
        String str = "Piyush";
        Stack<Character> stack = new Stack<>();
        System.out.println("Original String is : "+str);
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            stack.add(ch);
        }
        System.out.print("Reversed String is : ");
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
