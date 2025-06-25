package BinarySearch;

public class MinInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        int[] arr2 = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(findMin(arr));
        System.out.println(findMin(arr2));
    }
    static int findMin(int[] arr){
        int start = 0;
        int end = arr.length-1;
        if(arr[start]<=arr[end]){
            return arr[start];
        }
        else{
            while(start<end){
                int mid = start+(end-start)/2;
                if(arr[mid] > arr[end]){
                    start = mid+1;
                }
                else{
                    end = mid;
                }
            }
        }
        return arr[end];
    }
}
