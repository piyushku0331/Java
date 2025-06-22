package BinarySearch;

public class SmallestLetterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        System.out.println(nextGreatestLetter(letters, target));
        char[] letters2 = {'x', 'x', 'y', 'y'};
        char target2 = 'z';
        System.out.println(nextGreatestLetter(letters2, target2));
    }
    static char nextGreatestLetter(char[] letters, char target){
        int start = 0;
        int end = letters.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<letters[mid]){
                end = mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return letters[start%letters.length];
    }
}
