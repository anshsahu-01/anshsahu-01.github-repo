package Algorithms;

public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = {1,2,10,7,13};
        int n = arr.length;
        int target = 7;
        int ans = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == target){
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
