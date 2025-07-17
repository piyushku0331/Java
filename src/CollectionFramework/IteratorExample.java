package CollectionFramework;

import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Cherry");
        fruits.add("Banana");
        Iterator<String> itr = fruits.iterator();
        while(itr.hasNext()){
            String fruit = itr.next();
            System.out.println(fruit);
        }
        fruits.removeIf(s -> s.equals("Cherry"));
        System.out.println("List is : "+fruits);
    }
}
