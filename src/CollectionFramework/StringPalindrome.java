package CollectionFramework;

import java.util.*;

public class StringPalindrome {

    public static boolean isPalindrome(String str){
        Deque<Character> dq = new ArrayDeque<>();
        for(char ch : str.toLowerCase().toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                dq.addLast(ch);
            }
        }
        while(dq.size() > 1){
            if(dq.removeLast() != dq.removeFirst()){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "LOL";
        if(isPalindrome(str)){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("String is not Palindrome");
        }
    }
}
