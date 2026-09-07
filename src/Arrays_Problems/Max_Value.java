package Arrays_Problems;

public class Max_Value {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int max = arr[0];
        int maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("Max Value is :" + max + " at index :" + maxIndex);
    }
}
