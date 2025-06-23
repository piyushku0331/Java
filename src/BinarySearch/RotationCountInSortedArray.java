package BinarySearch;

public class RotationCountInSortedArray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        int[] arr2 = {2, 1, 3, 4};
        System.out.println(rotationCount(arr));
        System.out.println(rotationCount(arr2));
    }
    static int rotationCount(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid+1;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid;
            }
            if(arr[start]>=arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return 0;
    }
}
