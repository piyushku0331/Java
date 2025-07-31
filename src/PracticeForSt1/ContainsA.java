package PracticeForSt1;

import java.util.Stack;
import java.util.function.Function;

public class ContainsA {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.add("PiyushA");
        st.add("ArpitaA");
        st.add("Piyush");
        Function<Stack<String>, Boolean> endsWithA = stack -> {
            for(String str : stack){
                if (!str.endsWith("A")){
                   return false;
                }
            }
            return true;
        };
        boolean result = endsWithA.apply(st);
        System.out.println(result);
    }
}
