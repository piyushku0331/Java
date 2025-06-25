package BinarySearch;

import java.util.Arrays;

public class SearchInMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 3;
        int[][] arr2 = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target2 = 13;
        System.out.println(Arrays.toString(search(arr,  target)));
        System.out.println(Arrays.toString(search(arr2, target2)));
    }
    static int[] search(int[][] arr, int target){
        int rowSize = arr.length;
        int colSize = arr[0].length;
        int start = 0;
        int end = (rowSize * colSize) -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            int row = mid/colSize;
            int col = mid%colSize;
            if(arr[row][col] > target){
                end = mid-1;
            }
            else if(arr[row][col]<target){
                start=mid+1;
            }
            else return new int[]{row,mid} ;
        }
        return new int[]{-1, -1};
    }
}
