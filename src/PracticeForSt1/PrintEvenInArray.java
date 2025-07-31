package PracticeForSt1;

import java.util.*;

public class PrintEvenInArray {
    public static List<Integer> printArr(int[] arr){
        List<Integer> list = new ArrayList<>();
        for(int val : arr){
         if(val%2==0){
             list.add(val);
         }
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the end value : ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i<N; i++){
            arr[i] = i+1;
        }
        System.out.println("The even elements in the array are : "+printArr(arr));
    }
}
