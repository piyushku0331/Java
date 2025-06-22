package BinarySearch;

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        System.out.println(findInMountainArray(arr,target));
        int[] arr2 = {0, 1, 2, 4, 2, 1};
        int target2 = 3;
        System.out.println(findInMountainArray(arr2,target2));
    }
    static int peakIndex(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]) end = mid;
            else start = mid+1;
        }
        return start;
    }
    static int orderAgnosticBS(int[] arr,int target, int start, int end){
        boolean isAsc = arr[start]<arr[end];
        while(start<=end){
            int mid = start +(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target>arr[mid]){
                    start = mid+1;
                }
                else{
                    end=mid-1;
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
    static int findInMountainArray(int[] arr,int target){
        int peak = peakIndex(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if(firstTry!=-1){
            return firstTry;
        }
        return orderAgnosticBS(arr, target, peak+1, arr.length-1);
    }
}