package PracticeForSt1;

import java.util.ArrayList;
import java.util.function.Predicate;

public class MultipleOf5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(45);
        list.add(10);
        list.add(5);
        Predicate<Integer> isDivisible = num -> num%5==0;
        for(int val : list){
            if(isDivisible.test(val)){
                System.out.println("divisible");
            }
            else{
                System.out.println("Not Divisible");
            }
        }

    }
}
