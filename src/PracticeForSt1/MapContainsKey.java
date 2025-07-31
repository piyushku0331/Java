package PracticeForSt1;

import java.util.*;

public class MapContainsKey {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Piyush");
        map.put(2, "Apple");
        map.put(3, "Orange");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the key you are searching for : ");
        int key = sc.nextInt();
        System.out.println(map.getOrDefault(key, "Given key does not exist"));
    }
}
