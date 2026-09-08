package Arrays_Problems;
import java.util.Arrays;
import java.util.Scanner;

public class Right_K_Shift {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = arr.length;
        k = k%n;

        for (int i = 0; i < k; i++) {
            int temp = arr[n-1];
            for (int j = n-1; j > 0; j--) {
                arr[j] = arr[j-1];
            }
            arr[0] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
