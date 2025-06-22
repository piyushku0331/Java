package BinarySearch;

public class AgonisticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        int target = 7;
        System.out.println(agonisticBinSearch(arr,target));
        int[] arr2 = {20, 15, 10, 5, 0, -5};
        int target2 = 10;
        System.out.println(agonisticBinSearch(arr2,target2));
    }
    static int agonisticBinSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start]<arr[end];
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(target>arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
