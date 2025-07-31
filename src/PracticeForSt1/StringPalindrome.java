package PracticeForSt1;

import java.util.*;

public class StringPalindrome {
    public static boolean stringPalindrome(String str){
        Deque<Character> dq = new ArrayDeque<>();
        for(char ch : str.toLowerCase().toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                dq.addLast(ch);
            }
        }
        while(dq.size()>1){
            if(dq.removeFirst() == dq.removeLast()){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        if(stringPalindrome(str)) {
            System.out.println("String is Palindrome");
        }
        else {
            System.out.println("String is not Palindrome");
        }
    }
}
