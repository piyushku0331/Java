package PracticeForSt1;

import java.util.*;

public class StringEndsWithH {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "PiyushH");
        map.put(2, "HarshH");
        map.put(3, "Hello");
        List<String> list = new ArrayList<>();
        for(String val : map.values()){
            if(val.endsWith("H")){
                list.add(val);
            }
        }
        for(String value : list){
            System.out.println(value);
        }
    }
}
