package BinarySearch;

public class FindInRotatedSortedArray2 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 0, 0, 1, 2};
        int target = 0;
        int[] arr2 = {1, 0, 1, 1, 1};
        int target2 = 0;
        System.out.println(search(arr, target));
        System.out.println(search(arr2, target2));
    }
    static boolean search(int[] arr, int target){
        int peak =  pivot(arr);
        if(peak == -1){
            return binarySearch(arr, target, 0, arr.length-1);
        }
        if(arr[peak]==target){
            return true;
        }
        else if(target>=arr[0]){
            return binarySearch(arr, target, 0, peak);
        }
        return binarySearch(arr, target, peak+1, arr.length-1);

    }
    static boolean binarySearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start +(end-start)/2;
            if(target == arr[mid]){
                return true;
            }
            else if(target < arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return false;
    }
    static int pivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = start +(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                if(arr[start]>arr[mid+1]){
                    return start;
                }
                start++;
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            else if(arr[start]<arr[end] || (arr[start]==arr[mid] && arr[mid]>arr[end])){
                start = mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
