package PracticeForSt1;

import java.util.*;

public class ValidParenthesis {
    public static boolean balancedParenthesis(String parenthesis){
        Stack<Character> st = new Stack<>();
        for(int i = 0 ;i<parenthesis.length(); i++){
            char ch = parenthesis.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }
            else if(ch == ')' || ch == ']' || ch == '}'){
                if(st.empty()){
                    return false;
                }
                char top = st.pop();
                if((ch == ')' && top != '(') || (ch =='}' && top != '{') || (ch == ']' && top != '[')){
                    return false;
                }
            }
        }
        return st.empty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a parenthesis string : ");
        String parenthesis = sc.nextLine();
        if(balancedParenthesis(parenthesis)){
            System.out.println("Brackets are balanced");
        }
        else {
            System.out.println("Brackets not balanced");
        }
    }
}
