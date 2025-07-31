package PracticeForSt1;

import java.util.*;

public class MaxAndMinInArr {
    public static int[] maxMin(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
            if (j < min) {
                min = j;
            }
        }
        return new int[]{max, min};
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
        System.out.println("The maximum and minimum elements in the array are : "+Arrays.toString(maxMin(arr)));
    }
}
