package PracticeForSt1;

import java.util.*;

public class SecondSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        boolean found = false;
        int firstSmallest = arr[0];
        for(int i = 1; i < size; i++){
            if(firstSmallest != arr[i]){
                System.out.println(arr[i]);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Not found");
        }
    }
}
