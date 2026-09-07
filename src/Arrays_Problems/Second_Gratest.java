package Arrays_Problems;

public class Second_Gratest {
    public static void main(String[] args) {
        int[] arr = {1,21,3,4,5};
        int maxValue = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue){
                secMax = maxValue;
                maxValue = arr[i];
            } else if (arr[i] > secMax) {
                secMax = arr[i];
            }
        }
        System.out.println("Max value is :" + maxValue + "second max value is : " + secMax);
    }
}
