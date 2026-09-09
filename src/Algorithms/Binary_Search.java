package Algorithms;

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7,8,12,45};
        int target = 12;
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int ans = -1;

        while (start <= end){
            int mid = start + (end - start)/2;       // Prevents Overflow
            if (arr[mid] == target){
                ans = mid;
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println(ans);
    }
}
