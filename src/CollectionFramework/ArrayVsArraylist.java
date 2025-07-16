package CollectionFramework;

import java.util.*;

public class ArrayVsArraylist {
    public static void main(String[] args) {
        int[] numArray = new int[3];
        numArray[0] = 10;
        numArray[1] = 20;
        numArray[2] = 30;
        System.out.println("Array Elements : ");
        for(int num : numArray){
            System.out.println(num);
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("ArrayList Elements Are : ");
        for(int num : list){
            System.out.print(" "+num);
        }
    }
}
