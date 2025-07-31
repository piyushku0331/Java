package PracticeForSt1;

import java.util.*;

public class PrintUniqueInArr {
    public static List<Integer> printUnique(List<Integer> lst){
        Map<Integer, Integer> map = new LinkedHashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int val : lst){
            map.put(val, map.getOrDefault(val, 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                list.add(entry.getKey());
            }
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> lst = new ArrayList<>();
        System.out.print("Enter the size of the list : ");
        int size = sc.nextInt();
        System.out.print("Enter the list elements : ");
        for(int i = 0; i<size; i++){
            lst.add(sc.nextInt());
        }
        System.out.println("The unique elements in the array are : "+printUnique(lst));
    }
}
