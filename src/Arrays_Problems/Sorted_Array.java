package Arrays_Problems;
import java.util.Arrays;

public class Sorted_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,34,45,7};
        boolean isSorted = true;
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            if (arr[i+1] < arr[i]){
                isSorted = false;
            }
        }
        System.out.println(isSorted);
    }
}
