package BinarySearch;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target =  8;
        System.out.println(Arrays.toString(searchRange(arr, target)));
        int[] arr2 = {5, 7, 7, 7, 8, 8, 8, 8, 10, 10, 10, 10};
        int target2 = 5;
        System.out.println(Arrays.toString(searchRange(arr2, target2)));
    }
    static int[] searchRange(int[] arr,int target){
        int[] ans = {-1, -1};
        ans[0]=search(arr,target,true);
        if(ans[0]!=-1){
            ans[1]=search(arr,target,false);
        }
        return ans;
    }
    static int search(int[] arr, int target, boolean found){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                ans=mid;
                if(found){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
