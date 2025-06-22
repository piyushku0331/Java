package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {123, 69, 78, 56, 789, 65, 1, 2, 74};
        int target = 123;
        System.out.println(binarySearch(arr, target));
    }
    static void sortArr(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    static int binarySearch(int[] arr, int target){
        sortArr(arr);
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
