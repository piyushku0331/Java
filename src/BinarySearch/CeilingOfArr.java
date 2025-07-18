package BinarySearch;

public class CeilingOfArr {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 14;
        System.out.println(ceilingArr(arr,target));
        int[] arr2 = {2, 3, 5, 9, 14, 16, 18};
        int target2 = 6;
        System.out.println(ceilingArr(arr2,target2));
    }
    static int ceilingArr(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return arr[mid];
            }
        }
        return arr[start];
    }
}
