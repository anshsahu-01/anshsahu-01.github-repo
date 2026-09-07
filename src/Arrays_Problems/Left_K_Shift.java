package Arrays_Problems;
import java.util.Arrays;
import java.util.Scanner;

public class Left_K_Shift {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Shifts :");
        int k = sc.nextInt();
        int n = arr.length;
        k = k%n;

        for (int i = 0; i < k; i++) {
            int temp = arr[0];
            for (int j = 1; j < n; j++) {
                arr[j-1] = arr[j];
            }
            arr[n-1] = temp;
        }
        System.out.println("The array after " + k + " rotations is :" + Arrays.toString(arr));
    }
}
