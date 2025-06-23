package BinarySearch;

public class FindInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int[] arr2 = {4, 5, 6, 7, 0, 1, 2};
        int target2 = 3;
        System.out.println(search(arr, target));
        System.out.println(search(arr2, target2));
    }
    static int search(int[] arr, int target){
        int peak = pivot(arr);
        if(peak==-1){
            return binarySearch(arr, target, 0, arr.length-1);
        }
        else if(arr[peak]==target){
            return peak;
        }
        else if(target>=arr[0]){
            return binarySearch(arr, target, 0, peak-1);
        }
        return binarySearch(arr, target, peak + 1, arr.length - 1);
    }
    static int binarySearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    static int pivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
