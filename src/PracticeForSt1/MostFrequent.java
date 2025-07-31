package PracticeForSt1;

import java.util.*;

public class MostFrequent {
    public static int mostFrequentInArr(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        int maxFreq = 0;
        int ans = -1;
        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
            if (map.get(j) > maxFreq) {
                maxFreq = map.get(j);
                ans = j;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the array elements : ");
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The Most Frequent Element in the array is : "+mostFrequentInArr(arr));
    }
}
