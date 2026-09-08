package Arrays_Problems;

import java.util.Arrays;

public class Move_Zeros {
    public static void main(String[] args) {
        int[] arr = {1,0,3,0,5};
        int n = arr.length;
        int[] ans = new int[n];
        int start = 0;
        int end = n-1;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0){
                ans[start++] = arr[i];
            } else {
                ans[end--] = arr[i];
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
