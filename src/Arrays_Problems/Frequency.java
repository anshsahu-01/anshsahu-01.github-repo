package Arrays_Problems;

import java.util.Arrays;

public class Frequency {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,0,0,6,7};
        int max = arr[0];

        for(int ele : arr){
            max = Math.max(ele , max);
        }

        int[] freq = new int[max + 1];

        for(int ele : arr){
            freq[ele]++;
        }
        for (int i = 0; i < freq.length; i++) {
            if(freq[i] != 0)
                System.out.println(i + "-" + freq[i]);
        }
        System.out.println(Arrays.toString(freq));
    }
}
