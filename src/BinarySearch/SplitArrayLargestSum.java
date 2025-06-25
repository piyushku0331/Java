package BinarySearch;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 10, 8};
        int k = 2;
        int[] arr2 = {1, 2, 3, 4, 5};
        int k2 = 2;
        System.out.println(splitArray(arr, k));
        System.out.println(splitArray(arr2, k2));
    }
    static int splitArray(int[] nums, int k){
        int start = 0;
        int end = 0;
        for (int value : nums) {
            start = Math.max(start, value);
            end += value;
        }
        while(start < end){
            int mid = start + (end-start)/2;
            int sum = 0;
            int count = 1;
            for (int j : nums) {
                if (sum + j > mid) {
                    sum = j;
                    count++;
                } else {
                    sum += j;
                }
            }
            if(count>k){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return start;
    }
}
