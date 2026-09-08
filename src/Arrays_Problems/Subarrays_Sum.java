package Arrays_Problems;

public class Subarrays_Sum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5};
        int sum = 0;
        int count = 0;
        int target = 12;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == target){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
