package PracticeForSt1;

import java.util.*;

public class SortDescending {
    public static int[] sort(int[] arr){
        int len = arr.length;
        for(int i = 0; i<len-1; i++){
            for(int j = 0; j<len-i-1; j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter array elements : ");
        for (int i = 0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array is : "+ Arrays.toString(sort(arr)));
    }
}
